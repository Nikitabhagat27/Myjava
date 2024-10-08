package Strings;

public class Prac_25 {
    //practice prob 4
    public static void main(String[] args) {
         int n = 5;
         for(int i=1; i<=10; i++){
             System.out.println( "table of 5 =" +n*i);
         }
//prob 5
        int m = 5;
        for(int j=10; j>=1; j--){
            System.out.println( "table of 5 =" +n*j);
        }
//prob_6
        int l=5;
        int b=1;
        int factorial=1;
        while(b<=l){
            factorial *= b;
            b++;
        }
        System.out.print("factorial of 5 = ");
        System.out.println(factorial);
//prob 5
        int fact=1;
        int r=4;
        for(int q=1; q<=r; q++){
            fact *= q;
        }
        System.out.println(fact);





    }

}
