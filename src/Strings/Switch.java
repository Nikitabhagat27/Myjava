package Strings;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int age ;
        System.out.println("enter you age");
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println( "adult");
                break;
            case 23:
                System.out.println("job");
                break;
                case 60:
                    System.out.println("get retired");
                    break;
            default:
                System.out.println("End enjoy you life");
        }

//        char var ='r';
//        age=sc.nextLine().charAt(8);
//
//        switch(var){
//            case "var":
//                System.out.println( "adult");
//
//            case "char":
//                System.out.println("job");
//                break;
//            case "jo":
//                System.out.println("get retired");
//                break;
//            default:
//                System.out.println("End enjoy you life");
//        }




    }
}
