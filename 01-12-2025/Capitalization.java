package codeforces01122025;

import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] row = s.toCharArray();

        if (row[0] >= 'a' && row[0] <= 'z')  row[0] = (char) (row[0] - 32);   
        
        System.out.println(new String(row));
    }
}
