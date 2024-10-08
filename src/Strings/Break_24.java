package Strings;

public class Break_24 {
    public static void main(String[] args) {
        //break snd continue using loops
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("ending the loop");
                break;

            }
        }

        for (int i = 0; i < 50; i++) {
            if (i == 2) {
                System.out.println("ending the loop");
                continue;

            }
            System.out.println(i);// continue ke baad ki line skip ho jayegi direct 3 print hoga
            System.out.println("java is great");
        }

        System.out.println("loop  ends here");

        int j = 0;
        while (j < 5) {
            System.out.println(j);
            System.out.println("java is great");
            if (j == 2) {
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }
        System.out.println("loop end here");

        int g = 0;
        do {
            g++;
            if (g == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(g);
            System.out.println("java is great");
        } while (g < 5);
            System.out.println("loops end here");



    }
}