package codeforces06102025;

import java.util.Scanner;

public class CirnoandOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            if (n == 1) {
                System.out.println(arr[0]);
                continue;
            }

            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            long curr = sum;
            long len = n;

            while (len > 1) {
                for (int i = 0; i < len - 1; i++) {
                    arr[i] = arr[i + 1] - arr[i];
                }
                len--;

                curr = 0;
                for (int i = 0; i < len; i++) {
                    curr += arr[i];
                }

                sum = Math.max(sum, Math.abs(curr));
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
