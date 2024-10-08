package Arrays_;

public class Pr_3 {
    public static void main(String[] args) {
        float [] marks={45.3f, 77.6f,86.3f,499.2f, 100f};
        float sum =0;
        for(float element:marks){
            sum =sum+element;
        }
        System.out.println("the average marks is "+sum/marks.length);
    }
}
