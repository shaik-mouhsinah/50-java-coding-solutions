import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            String value = sc.next();

            try {
                long n = Long.parseLong(value);

                System.out.println(value + " can be fitted in:");

                if (n >= -128 && n <= 127) {
                    System.out.println("* byte");
                }

                if (n >= -32768 && n <= 32767) {
                    System.out.println("* short");
                }

                if (n >= -2147483648L && n <= 2147483647L) {
                    System.out.println("* int");
                }

                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(value + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}



