package Day15;

import java.util.Scanner;

public class TomRiddlesDiary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<t;i++){
            String s = sc.next();
            if(sb.toString().contains(" " + s + " ")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
                sb.append(" ").append(s).append(" ");;
            }
        }
    }
}
