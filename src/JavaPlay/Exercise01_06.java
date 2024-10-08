package JavaPlay;
import java.util.Scanner;

public class Exercise01_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float Total=500;
        System.out.println( "Enter the five subject marks ");
        float sub1= sc.nextFloat();
        float sub2= sc.nextFloat();
        float sub3= sc.nextFloat();
        float sub4= sc.nextFloat();
        float sub5= sc.nextFloat();
        float sum=sub2+sub2+sub3+sub4+sub5;
        float TotalMarks =(sum/Total)*100;
        System.out.println( TotalMarks);


    }
}
