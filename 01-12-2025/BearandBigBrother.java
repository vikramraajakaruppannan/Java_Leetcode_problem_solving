package codeforces01122025;

import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count=0;
        while(true){
            a=a*3;
            b=b*2;
            count++;
            if(a>b) break;
        }

        System.out.println(count);
    }
}
