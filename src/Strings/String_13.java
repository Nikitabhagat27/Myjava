package Strings;
import java.util.Scanner;
public class String_13 {
    public static void main(String[] args) {
        String name = "nikita";
        System.out.println("the name is :");
        System.out.println(name);
        int a=6;
        float b= 5.64667f;
        System.out.printf("the value of a is %d and value of b is %f",a,b);
        // %d formate specifier
        System.out.format("%d %f",a,b);

        Scanner sc=new Scanner(System.in);
        //String st =sc.next();
        String st = sc.nextLine();
        System.out.println(st);



    }



}
