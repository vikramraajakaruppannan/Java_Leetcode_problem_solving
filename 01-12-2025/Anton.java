package codeforces01122025;

import java.util.Scanner;

public class Anton {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String str = sc.next();
        char[] row = str.toCharArray();

        int count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(row[i]=='A') count1++;
            else if(row[i]=='D') count2++;
        }

        if(count1>count2) System.out.println("Anton");
        else if(count2>count1) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
