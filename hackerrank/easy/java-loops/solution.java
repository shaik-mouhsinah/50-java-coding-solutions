import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int query = 0; query < q; query++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int power = 1;

            for (int i = 0; i < n; i++) {
                sum += power * b;
                System.out.print(sum + " ");

                power *= 2;
            }

            System.out.println();
        }

        sc.close();
    }
}
