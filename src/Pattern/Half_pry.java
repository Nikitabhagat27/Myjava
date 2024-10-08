package Pattern;

public class Half_pry {
    public static void main(String[] args) {
         int n= 4;
        //for(int i =10; i<=n; i++){
            // for(int  j=i; j<=n; j++){
        for(int i =n; i>=1; i--){
             for(int j=1; j<=i; j++){
                 System.out.print("*");
             }

             System.out.println( );

        }
    }
 }

