package Strings;

import java.util.Scanner;

public class Else_If_18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = 56;
        age=sc.nextInt();
        if (age > 56) {
            System.out.println("you are experienced");
        } else if (age > 46) {
            System.out.println("you semi- exprienced");
        } else if (age > 36) {
            System.out.println("you are sem - semi experienced");
        } else {
            System.out.println("you are not  experienced");
        }if(age>2){
            System.out.println("you are not a baby");
        }
    }



}