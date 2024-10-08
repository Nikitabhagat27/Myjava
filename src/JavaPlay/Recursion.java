package JavaPlay;

public class Recursion {
    //factorial(0)=1;
    //factorial(n) = n * n-1 *.....
    // factorial(5) =5* *3* 2 *1
    // factorial (n) = n * factoroial (n-1)
    static int factorial (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
        static int factorial_iterative(int n){
            if(n==0 || n==1) {
                return 1;
            }
            else{
               int  product=1;
               for(int i=1; i<=n; i++){
                   product *=i;
               }
               return product;
            }

    }
    public static void main(String[] args) {
        int x = 6;
        //int n =1;
        //int n =0;
        System.out.println(  "the value of n is:=" + factorial(x));

        System.out.println(  "the value of n is:=" + factorial_iterative(x));
    }
}
