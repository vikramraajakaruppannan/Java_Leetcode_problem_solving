package codeforces01122025;

import java.util.Scanner;

public class VanyaandCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int sum=0;
        for(int i=0;i<n;i++) sum+=arr[i];

        sum = Math.abs(sum);

        int cards = (sum + div - 1) / div;

        System.out.println(cards);
    }
}
