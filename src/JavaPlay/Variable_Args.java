package JavaPlay;

public class Variable_Args {
//    static int sum (int a , int b){
//        return a+b;
//    }
//    static int sum (int a , int b , int c){
//        return a+b+c;
//    }
//    static int sum (int a , int b , int c , int d){
//        return a+b+c+d;
//   }

    static int sum(int x ,int ...arr){
       //Avaliable as int arr []  arr;
       int result=0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println( "welcome to varargs toturial");
        System.out.println(" the sum are "+sum(1));//int x hoga ho
      //  System.out.println(" the sum are "+sum());//sum=0
        System.out.println(" the sum are "+sum(7 ,78));
        System.out.println( " The sum "+sum(73,6,78));
        System.out.println( " The sum "+sum(70,60,9,5,9,9));



    }
}
