package Strings;

public class Ps_15 {
    public static void main(String[] args) {
        //problem 1
        String name ="Jack Parker";
        name=name.toLowerCase();
        System.out.println(name.toLowerCase());

        //problem 2
        String text="to lower case";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem 3
        String letter="dear |<name>| , thanks alot";
        letter= letter.replace("|<name>|","nikia");
        System.out.println(letter);

        //problem4
        String MyString="this string contain double and tripple spaces";
        System.out.println(MyString.indexOf(" "));;
        System.out.println(MyString.indexOf("  "));;

        String MyLetter="Dear harry,\n\tThis java course is Nice.\n\tThanks";
        System.out.println(MyLetter);

          











    }
}

