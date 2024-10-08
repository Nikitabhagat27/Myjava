package Arrays_;

public class My {
        public static void fun(int n) {
            if (n == 0) return;      // Step 1: Base case
          //  System.out.println(n);    // Step 2: Print n before recursion
            fun(n - 1);               // Step 3: Recursive call (fun with n-1)
            System.out.println(n);    // Step 4: Print n after recursion
        }

        public static void main(String[] args) {
            fun(3);  // Call fun with n=3


        }
    }


