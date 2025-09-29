package Day14;

import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        while(t-- >0){

            String s1 = sc.next();

            String s2 ="codeforces";

            int count=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
