# Java Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

**Hint**: You can use comparators to sort a list of objects. See the [oracle docs](http://docs.oracle.com/javase/tutorial/collections/interfaces/order.html) to learn about comparators.

**Input Format**

The first line of input contains an integer $N$, representing the total number of students. The next $N$ lines contains a list of student information in the following structure:

    ID Name CGPA
    
  
**Constraints**

$2 \le N \le 1000$<br>
$0 \le ID \le 100000$<br>
$5 \le |Name| \le 30$<br>
$0 \le CGPA \le 4.00$<br>

The name contains only lowercase English letters. The $ID$ contains only integer numbers without leading zeros. The *CGPA* will contain, at most, 2 digits after the decimal point.

**Output Format**

After rearranging the students according to the above rules, print the first name of each student on a separate line.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T04:30:30.419Z  

```java
import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();

        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student a, Student b) {

                if (a.getCgpa() != b.getCgpa()) {
                    return Double.compare(b.getCgpa(), a.getCgpa());
                }

                int nameCompare = a.getFname().compareTo(b.getFname());

                if (nameCompare != 0) {
                    return nameCompare;
                }

                return Integer.compare(a.getId(), b.getId());
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-sort/problem)