package Pattern;

public class Invert_pry_5 {
    public static void main(String[] args) {
        int n=4;
        for(int i =1; i<=n; i++){
            //inne loop for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // inne loop for print star
            for(int j=1; j<=i; j++ ){
                System.out.print( "*");

            }
            System.out.println();
        }

    }
}
