package codeforces01122025;

import java.util.Scanner;

public class MishkaandGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int n = t*2;

        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int count1=0,count2=0;
        for(int i=0;i<n;i+=2){
            int a = arr[i];       
            int b = arr[i+1];     

            if(a > b) count1++;
            else if(a < b) count2++;
        }

        if(count1>count2)System.out.println("Mishka");
        else if(count1<count2)System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
    
}
