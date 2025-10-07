package codeforces06102025;

import java.util.Arrays;
import java.util.Scanner;

public class AandB {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){

            int n1=sc.nextInt();

            String s = sc.next();

            int[] arr1 = new int[s.length()];
            int[] arr2 = new int[s.length()];

            int m=0;
            int n=0;
            
            for(int i=0;i<n1;i++){
                if(s.charAt(i)=='a'){
                    arr1[m++]=i+1;
                }
                else{
                    arr2[n++]=i+1;
                }
            }

            arr1 = Arrays.copyOf(arr1, m);
            arr2 = Arrays.copyOf(arr2, n);

            if (arr1.length == 0 || arr2.length == 0) {
                System.out.println(0);
                continue;
            }


            long[] adjA = new long[arr1.length];
            long[] adjB = new long[arr2.length];

            for(int i=0;i<arr1.length;i++){
                adjA[i] = (long) arr1[i] - i;
            }

            for(int i=0;i<arr2.length;i++){
                 adjB[i] = (long) arr2[i] - i;
            }


            Arrays.sort(adjA);
            Arrays.sort(adjB);

            long medianA = adjA[adjA.length / 2];
            long medianB = adjB[adjB.length / 2];

             long sum1 = 0L, sum2 = 0L;

            for (long x : adjA) {
                sum1 += Math.abs(medianA - x);
            }

            for (long x : adjB) {
                sum2 += Math.abs(medianB - x);
            }
            

            long result = Math.min(sum1, sum2);
            System.out.println(result);

        }
    }
}
