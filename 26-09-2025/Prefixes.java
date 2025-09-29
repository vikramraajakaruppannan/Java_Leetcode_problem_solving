package Day12;

import java.util.Scanner;

public class Prefixes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String s =sc.nextLine();


        int count=0;

        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n;i+=2){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(s.charAt(i)=='a'){
                    sb.setCharAt(i+1, 'b');
                }
                else{
                    sb.setCharAt(i+1, 'a');
                }
            }
        }

        System.out.println(count);
        System.out.println(sb.toString());
    }
}
