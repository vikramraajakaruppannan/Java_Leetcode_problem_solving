package codeforces01122025;

import java.util.Scanner;

public class Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String str1 = Integer.toString(n);
        String str2 = Integer.toString(m);

        int maxLen = Math.max(str1.length(), str2.length());
        str1 = String.format("%" + maxLen + "s", str1).replace(' ', '0');
        str2 = String.format("%" + maxLen + "s", str2).replace(' ', '0');

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLen; i++) {
            if (str1.charAt(i) == str2.charAt(i)) result.append('0');
            else result.append('1');
        }

        System.out.println(result);

    }
}
