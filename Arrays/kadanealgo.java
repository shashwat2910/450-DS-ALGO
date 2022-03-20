package Arrays;

import java.util.Scanner;

public class kadanealgo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            long max_sum = arr[0], curr_sum = 0;
            for (int i = 0; i < n; i++) {
                curr_sum = Math.max(curr_sum + arr[i], arr[i]);
                max_sum = Math.max(curr_sum, max_sum);
            }
            System.out.println(max_sum);
        }
    }
}
