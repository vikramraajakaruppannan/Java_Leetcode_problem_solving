package codeforces14102025;

import java.util.Scanner;

public class SoldierandBananas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int initial = sc.nextInt();
        int amount = sc.nextInt();
        int total = sc.nextInt();

        int totalamount=0;
        for(int i=1;i<=total;i++){
            totalamount += i*initial;
        }

        if(amount>totalamount){
            System.out.println(0);
        }
        else{
            System.out.println(totalamount-amount);
        }
        

    }
}
