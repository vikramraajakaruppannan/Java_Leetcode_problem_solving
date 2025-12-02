package codeforces01122025;

import java.util.Scanner;

public class Stone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        int count=0;
        for(int i=0;i<n&i+1<n;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
        }

        System.out.println(count);
    }
}
