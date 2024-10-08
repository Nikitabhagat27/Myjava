package Strings;

public class String_14 {
    public static void main(String[] args) {
        String name = "nikita";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring =name.toLowerCase();
        System.out.println(lstring);

        String Ustring =name.toUpperCase();
        System.out.println(Ustring);

        String Tstring =name.trim();// space trim kr degi
        System.out.println(Tstring);

        String substring =name.substring(1,4);
        System.out.println(substring);

        String str = "Hello";
        String sub =str.substring(1,4);//first and last ko chorke
        System.out.println(sub);
        String subStr = str.substring(1, 5);
        //String subStr = str.substring(1, 2);
        //String subStr = str.substring(1, 3);
        //String subStr = str.substring(1, 5);

        System.out.println(subStr);
        // subStr = "ell"// isme only start and fourt position di hui hai
        System.out.println( name.substring(1));//start string name diyahai isme

        String Rstring =name.replace("i","k");// space trim kr degi
        String Rrstring = name.replace('i','p');
        System.out.println(Rstring);
        System.out.println(name.startsWith("Nik"));
        System.out.println(name.startsWith("n"));
        System.out.println(name.endsWith("ita"));
        System.out.println( name.charAt(0));
        System.out.println( name.charAt(2));
        System.out.println( name.indexOf("ki"));
        System.out.println(name.indexOf("s",3));

        String modifiedName ="nikitaaa";
        System.out.println(modifiedName.indexOf("taaa343435"));
        System.out.println(modifiedName.indexOf("taa",4));
        System.out.println(modifiedName.lastIndexOf("ta"));
        System.out.println( name.equals("nikita"));
        System.out.println(name.equalsIgnoreCase("Nikita"));






    }
}
