package Arrays_;

public class Arr_3 {
    public static void main(String[] args) {
        // int marks[];// 1 - D array
        int flats[][];//2-D array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        System.out.println();
        //displaying array for  2 - D array
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[0].length; j++) {
                System.out.println(flats[i][j]);
                System.out.println(" ");
            }
            System.out.println("");

        }
    }
}
