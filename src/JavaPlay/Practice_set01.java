package JavaPlay;
import java.util.Scanner;

public class Practice_set01 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=5;
        int sum = a+b+c;
        System.out.println(sum);

        //Question2

        float subject1 =45;
        float subject2=95;
        float subject3 =89;
        float cgpa =(subject1+subject2+subject3)/30;
        System.out.println(cgpa);


        //Question3
        System.out.println("what is your name ");
        Scanner sc=new Scanner(System.in);
        String name =sc.next();
        System.out.println("hellow" + name    + "have a good day" );

        //Question5
        System.out.println("enter your number ");
        System.out.println(sc.hasNextInt());






    }
}
