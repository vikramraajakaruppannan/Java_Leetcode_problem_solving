package Day14;

import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
            
            String str1 = sc.next();
            String str2 = sc.next();

            char c1 = str1.charAt(0);
            char c2 = str2.charAt(0);

            StringBuilder sb1 = new StringBuilder(str1);
            StringBuilder sb2 = new StringBuilder(str2);


            sb1.setCharAt(0, c2);
            sb2.setCharAt(0, c1);
            
            // for(int i=0;i<str1.length();i++){
            //     if(i==0)sb1.append(c2);
            //     else sb1.append(str1.charAt(i));
            // }

            // for(int i=0;i<str2.length();i++){
            //     if(i==0)sb2.append(c1);
            //     else sb2.append(str2.charAt(i));
            // }

            System.out.print(sb1.toString()+ " ");
            System.out.print(sb2.toString());
            System.out.println();


            
        }

    }
}
