package Recurtion;

public class Recurtion_2 {

    //print Number from 1 to 5

    public static void printNum(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
       // System.out.println( n); reverse condition ko print krne ke liye i mean to say 54321 print hoga

    }
    public static void main(String[] args) {
        int n=1;
        printNum(n);//n=1
    }
}
