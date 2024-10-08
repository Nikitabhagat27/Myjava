package Arrays_;

public class Pr_4 {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {
                {1, 6, 5},
                {8, 3, 4}};

        int[][] result = {
                {0, 0, 0},
                {0, 0, 0}
        };

        for (int i = 0; i < mat1.length; i++) { // Loop through each row
            for (int j = 0; j < mat1[i].length; j++) { // Loop through each column
                result[i][j] = mat1[i][j] + mat2[i][j]; // Calculate the sum
                System.out.print(result[i][j]+  " "); // Print the updated value
            }
            System.out.println(""); // New line after each row
        }
    }
}
