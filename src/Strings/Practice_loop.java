package Strings;
import java.util.Scanner;
public class Practice_loop {
    public static void main(String[] args) {
       // int n = 5;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n= 5;
        //odd
        for (int i = 1; i < n; i++) {
            System.out.println(2 * i + 1);
        }

        System.out.println("please enter for even number");
        int p = sc.nextInt();
        for (int j = 1; j <= p; j++) {
            System.out.println(2 * j);
        }


        System.out.println("natural number print in decrementing order");
                int N = 10; // You can set n to any value

                for (int i = N; i >= 1; i--) {
                    System.out.println(i);
                }
            }

        }







