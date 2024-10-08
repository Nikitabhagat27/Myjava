package Strings;
import java.util.Scanner;
public class Practice_19 {
//    public static void main(String[] args) {
//          //question_2
//        byte m1, m2,m3;
//        Scanner sc= new Scanner(System.in);
//
//        System.out.println("Enter your marks in physics ");
//        m1= sc.nextByte();
//        System.out.println("enter marks in chemistry");
//        m2= sc.nextByte();
//        System.out.println("enter marks in mathematics");
//        m3= sc.nextByte();
//        float avg=(m1+m2+m3)/3.0f;
//        System.out.println("your overall percentage "+avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("congratulation you have been prmoted");
//        }else{
//            System.out.println("sorry you have not been promoted");
//        }
//        float tax = sc.nextFloat();
//
//        System.out.println("enter your income in laks");
//      //  float tax=0;
//        float income = 3.3f;
//        if(tax<2.5) {
//            tax =  0;
//        }
//       else  if (tax>2.5f && tax<5f) {
//            tax = tax + 0.05f * (income - 2.5f);
//
//        }
//       else if(tax>5f && tax<10.0f){
//           tax= tax+ 0.5f*(income -2.5f);
//        }
//        else if(tax>10.0f){
//            tax= tax+ 0.5f*(income -2.5f);
//            tax = tax + 0.05f * (income - 2.5f);
//            tax= tax+ 0.5f*(income -2.5f);
//        }
//        System.out.println( "the total tax paid by the employe is "+tax);
//
//    }

    //q.6

   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("this is an orginizational website ");
        } else if (website.endsWith(".com")) {
            System.out.println("this is an Indian website");
        } else if (website.endsWith(".in")) {
            System.out.println("this is an indian website");

        }


    }
    }


