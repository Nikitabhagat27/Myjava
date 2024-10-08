package Arrays_;

public class Pr_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,7};
        int l = arr.length;
        int n = Math.floorDiv(arr.length, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            //swap a[i] and a[l-1-i]
            // a b temp
            // |4| |3| | |
            temp = arr[i]; //|temp| |4| |3|
            arr[i] = arr[l - i - 1]; // |4| |temp| |3|
            arr[l - 1 - i] = temp; // |4| |3| |temp|


        }

        for (int element : arr) {
            System.out.print(element);
        }
    }
}

