package Arrays_;

public class Pr_6 {
    public static void main(String[] args) {
        int [] arr= {1, 21,34,5,6 ,78,98,};
        int max=0;
        for(int e : arr){
            if (e>max){
                max=e;
            }
        }
        System.out.println(max);
    }
}
