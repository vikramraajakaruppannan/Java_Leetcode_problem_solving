package codeforces07102025;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long m =sc.nextLong();
        long n = sc.nextLong();
        double a = sc.nextLong();

        double m_area = m/a;
        double n_area = n/a;

        long area1 = (long) Math.ceil(m_area);
        long area2 = (long) Math.ceil(n_area);

        System.out.println(area1*area2);
        
    }
}
