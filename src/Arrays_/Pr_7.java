package Arrays_;

public class Pr_7 {

        public static void main(String[] args) {
            int [] arr= {1, 21,34,5,6 ,78,98,};
            int min=0;
            for(int e : arr){
                if (e<min){
                    e=min;
                }
            }
            System.out.println(min);
        }
    }
