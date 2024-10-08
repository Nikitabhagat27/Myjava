package Strings;

import java.util.Scanner;

public class Do_While_22 {
    public static void main(String[] args) {
//    int a= 0;
//    while(a<5){
//        System.out.println(a);
//        a++;
//    }
      //  int b= 10;
        int b =0;

        do{
            System.out.println(b);
            b++;
        }while(b<5);

// quick quiz
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter a number");
        int c=1;
        do{
            System.out.println( c);
            c++;
        }while(c<=n);
        sc.close();


    }
}
