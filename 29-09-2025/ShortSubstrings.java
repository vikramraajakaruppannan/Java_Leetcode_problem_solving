package Day14;

import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){

            String s1 = sc.next();
            String s2="";


            for(int i=0;i<s1.length()-1;i++){
                if(s1.charAt(i)==s1.charAt(i+1)){
                    s2+=s1.charAt(i);
                    i++;
                }else{
                    s2+=s1.charAt(i);
                }
            }

            // if(s1.charAt(s1.length()-1)!=s1.charAt(s1.length()-2)){
                s2+=s1.charAt(s1.length()-1);
            // }

            

            System.out.println(s2);
        }
    }
}
