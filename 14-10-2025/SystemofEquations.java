package codeforces14102025;

import java.util.Arrays;
import java.util.Scanner;

public class SystemofEquations {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[1000];

        int idx = 0;
        while (idx * idx <= n) {
            arr[idx] = n - idx * idx;
            idx++;
        }


        int count=0;
        int[] arr1 = new int[1000];
        for(int i=0;i<idx;i++){
            arr1[i] = i + arr[i]*arr[i];
            if(arr1[i]==m) count++;
        }

        System.out.println(count);

    }
}
