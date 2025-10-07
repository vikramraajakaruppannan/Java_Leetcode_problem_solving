package codeforces07102025;

import java.util.Scanner;

public class Spreadsheets {

    static void excel(String str){
        int cInd = str.indexOf('C');

        int rVal = Integer.parseInt(str.substring(1, cInd));      
        int cVal = Integer.parseInt(str.substring(cInd+ 1));

        StringBuilder sb = new StringBuilder();
        while(cVal>0){
            cVal-=1;
            int rem = cVal % 26;
            char c = (char)(rem +'A');
            sb.append(c);
            cVal = cVal/26;
        }
        System.out.println(sb.reverse().toString()+""+rVal);
    }

    static void exceltocolumn(String str){
        StringBuilder sb2 = new StringBuilder();

        int num=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                char c=str.charAt(i);
                    num = num *26+(c-'A'+1);
            }
            else{
                sb2.append(str.charAt(i));
            }
        }

        System.out.println("R"+sb2.toString()+"C"+num);        
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){

            String str = sc.next();

            if(str.matches("R\\d+C\\d+")){

                excel(str);
                
                // int cInd = str.indexOf('C');

                // int rVal = Integer.parseInt(str.substring(1, cInd));      
                // int cVal = Integer.parseInt(str.substring(cInd+ 1));

                // StringBuilder sb = new StringBuilder();
                // while(cVal>0){
                //     cVal-=1;
                //     int rem = cVal % 26;
                //     char c = (char)(rem +'A');
                //     sb.append(c);
                //     cVal = cVal/26;
                // }
                // System.out.println(sb.reverse().toString()+""+rVal);
            }
            else{

                exceltocolumn(str);
                // StringBuilder sb2 = new StringBuilder();

                // int num=0;
                // for(int i=0;i<str.length();i++){
                //     if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                //         char c=str.charAt(i);
                //         num = num *26+(c-'A'+1);
                //     }
                //     else{
                //         sb2.append(str.charAt(i));
                //     }
                // }

                // System.out.println("R"+sb2.toString()+"C"+num);
            
            }
        }
    }
}
