package codeforces01122025;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int n = t*2;

        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int count=0;
        for(int i=0;i<n;i+=2){
            for(int j=1;j<n;j+=2){
                if (j == i + 1) continue;
                if(arr[i]==arr[j]) count++;
            }
        }

        System.out.println(count);
    }
}
