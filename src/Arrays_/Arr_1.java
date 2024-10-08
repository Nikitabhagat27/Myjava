package Arrays_;

public class Arr_1 {
    public static void main(String[] args) {
        //1.declaration + memory allocation
    int [] marks=new int[6];
    //initialization
    marks[0]=100;
    marks[1]=99;
    marks[2]=98;
    marks[3]=98;
    marks[4]=99;
    marks[5]=90;
    System.out.println( marks[2]);
    marks=new int [6];
//3.declaration + memory allocation +initialization
int number []={98,98,90,96,87,89};
float numberr [] ={98.0f,98.1f,90.0f,96.2f,87.3f,89.4f};
String students[]={"nikki","chiya","siyya","kiya"};
        System.out.println(number.length);
        System.out.println(numberr.length);
        System.out.println(students.length);
        System.out.println("printing using loop");//array traversal
        for(int i=0; i<numberr.length; i++){
            System.out.println(numberr[i]);
        }
    }
    }
