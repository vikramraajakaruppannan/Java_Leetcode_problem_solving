package Day15;

import java.util.Scanner;

public class DigitMinimization {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();


            if(n>9&&n<99){
                int k= n%10;
                int m = n/10;
                int to = k*10 +m;
                to=to/10;
                System.out.println(to);

            }
            else{
                int min=Integer.MAX_VALUE;
                while(n!=0){
                    int tk=n%10;
                    if(tk < min){
                        min = tk;
                    }
                    n=n/10;
                }
                System.out.println(min);
            }
        }
    }
}
