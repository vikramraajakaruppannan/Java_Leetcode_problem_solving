package Day14;

import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){
            String str1 = sc.next();
            int size = str1.length();

            if(size ==1){
                System.out.println("NO");
            }
            else if(size%2==1){
                System.out.println("NO");
            }
            
            else{

                String sub1 = str1.substring(0,size/2); 
                String sub2 = str1.substring(size/2);

                // System.out.print(sub1+" ");
                // System.out.print(sub2);
                System.out.println();
                if(sub1.equals(sub2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }

        }
    }
}
