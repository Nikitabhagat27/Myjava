package JavaPlay;

public class Practice_35 {
   static void multiplicaion( int n) {
       for (int i = 1; i <= 10; i++) {
           i=n*i;
           System.out.println( i);
       }
   }
   static void pattern(int n){
       for(int i=0;  i<=n; i++){
           for(int j=0; j<i; j++){
               System.out.print("*");
           }

       System.out.println( );

   }
    }
    //problem_1
    public static void main(String[] args) {
        multiplicaion(7);
        pattern(4);



    }
}