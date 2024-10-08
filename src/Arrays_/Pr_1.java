package Arrays_;

import com.sun.security.jgss.GSSUtil;

public class Pr_1 {
    public static void main(String[] args) {
         float [] marks={45.3f, 77.6f,86.3f,499.2f, 100f};
         float sum =0;
         for(float element: marks){
             sum= sum+element;          //for each loop
         }
        System.out.println( "the value of sum is "+ sum);
    }
}
