package day28exceptions;

public class Exceptions02 {
    private static String t;

    public static void main(String[] args) {

        String s = "1234";
        convertStringToInt(s);

        String t = "1a2eb3";
        convertStringToInt(t);
    }

    private static void convertStringToInt(String s) {
     String t = "";
        int intS = 0;
        try {
            intS = Integer.parseInt(t);
        } catch (NumberFormatException e) {
            System.out.println("bir string 'in sayiya donusturulebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }

        System.out.println(intS + 1);
    }
}
