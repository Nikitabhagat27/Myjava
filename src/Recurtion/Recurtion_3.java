package Recurtion;

public class Recurtion_3 {
    // print sum of first natural n numbers
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum = sum+i;
            System.out.println(sum);
            return;//?
        }
        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i);// ye condition kb chlegi
    }

    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
