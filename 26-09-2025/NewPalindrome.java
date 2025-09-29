package Day12;

import java.util.Scanner;

public class NewPalindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){

            String s = sc.next();

            int[] freq = new int[26];
            for(char c : s.toCharArray() ){
                freq[c - 'a']++;
            }

            // int[] arr = new int[26];
            // int i=0;
            int count=0;
            for(int n : freq){
                if(n>1){
                    // arr[i++]=n;
                    count++;
                }
            }

            if(count>2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
