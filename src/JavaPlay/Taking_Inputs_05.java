package JavaPlay;

import java.util.Scanner;

public class Taking_Inputs_05 {
    public static void main(String[] args) {
        System.out.println("taking input from the user ");
        Scanner sc= new Scanner(System.in);
       // int a = sc.nextInt();
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
        float a = sc.nextInt();
        System.out.println("Enter number 2");
        //int b = sc.nextInt();
        float b = sc.nextInt();
        float sum = a+b;
         //  int sum = a+b;
        System.out.println("the sum of this numbers is ");
        System.out.println(sum);
        String str = sc.next();
        String str1 = sc.nextLine();
        System.out.println(str);
        System.out.println(str1);






    }
}
