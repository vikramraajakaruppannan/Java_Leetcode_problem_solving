package codeforces14102025;

import java.util.Arrays;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] result = new int[n];

        int idx = 0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    result[idx++]=j+1;
                }
            }
        }

        for(int in : result){
            System.out.print(in +" ");
        }

        
    }
}
