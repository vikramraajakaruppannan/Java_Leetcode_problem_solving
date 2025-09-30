package Day15;

import java.util.Arrays;
import java.util.Scanner;

public class SubsequencePermutation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();
            char [] arr = s.toCharArray();
            Arrays.sort(arr);

            int count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)!=arr[i]){
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
