package Day12;

import java.util.Scanner;

public class StringEqualization{
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
            boolean [] freq = new boolean[26];

            String s1=sc.next();
            String s2=sc.next();

            for(char s : s1.toCharArray()){
                freq[s - 'a']=true;
            }

            boolean f=false;
            for(char s : s2.toCharArray()){
                if(freq[s -'a']){
                    f=true;
                    break;
                }
                
            }

            if(f){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            
            
        }
        
    }
}