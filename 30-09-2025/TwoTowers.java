package Day15;

import java.util.Scanner;

public class TwoTowers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();

            // StringBuilder sb = new StringBuilder(s2);
            // sb.reverse();

            // String s3 = s1 +sb.toString();
            String s3 = s1+" "+s2;

            int count=0;
            for(int i=0;i<s3.length()-1;i++){
                if(s3.charAt(i)==s3.charAt(i+1)){
                    count++;
                }
            }

            if(count==0){
                System.out.println("YES");
            }
            else if(count==1&&s1.charAt(n1-1)!=s2.charAt(n2-1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            // System.out.println(s1);
            // System.out.println(s2);
        }
    }
}
