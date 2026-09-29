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

            for (int i = 0; i < n; i++) {
                sum += (1 << i) * b;
                System.out.print(sum + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
