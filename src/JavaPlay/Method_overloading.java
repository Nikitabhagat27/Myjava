package JavaPlay;

public class Method_overloading {

    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){
        System.out.println("heyy broooo"+ a);
    }

    static void foo(int a , int b){
        System.out.println(" good mornuinfg nikki madam" +a +" "+b);
    }
    static void fooo(){
    }

    static void  change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }

    static  void tellJoke(){
     System.out.println("i inevented to new word \n"+"palagarasm ");
 }

    public static void main(String[] args) {
      //  tellJoke();

        //case1: changing the integer
        int x=45;
        change(x);
        System.out.println( "the value of  x after running change is  "+ x);

        // changing the array
        int [] marks ={ 12, 34 ,56 , 67 ,67 ,87 };
        change2(marks);
        System.out.println("changing the array in :"+  marks[0]);

        foo();
        foo(10);
        foo(90,89); //arguments are actual




    }
}
