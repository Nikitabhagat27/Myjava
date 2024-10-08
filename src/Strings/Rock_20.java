package Strings;
import java.util.Random;
import java.util.Scanner;

public class Rock_20 {
    public static void main(String[] args) {
        System.out.println("select 0 for rock \n\tselect 1 for paper \n\tselect 2 for scissor");
        Scanner sc= new Scanner (System.in);
        Random rc= new Random();
        System.out.println("its your turn");
        int human=sc.nextInt(3);
        if (human==0){
            System.out.println("you have select rock");
        }
        if(human==1){
            System.out.println("you have select paper");
        }if(human==2){
            System.out.println("computer have select scissor");
        }
        int computer = 0;
        if(human==computer ){
            System.out.println("match is draw");
        }else if (human==0 && computer==2 ||human==1 &&
        computer==0||human==2 && computer==1){
            System.out.println("congratulation you have won");
        }else{

            System.out.println("you lose\nbetter luck next time");
        }
        


    }
}
