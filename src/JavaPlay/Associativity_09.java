package JavaPlay;

public class Associativity_09 {
    public static void main(String[] args) {
         int d= 6*5-34/4;
         //highest  presedence goes to * and / .they are then evaluated on the basis of of left to right .
         int f = 60/5-34*2;
        System.out.println(d);
        System.out.println(f);
        //presidence and associtivity

        //quick quiz
        int x=6;
        int y= 1;
        int k=x*y/2;//left to right approach
        System.out.println(k);
        //quiz 2
        int b= 1;
        int a=4;
        int c=8;
        int h= b*b-(4*a*c)/(2*a);
        System.out.println(h);
    }
}
