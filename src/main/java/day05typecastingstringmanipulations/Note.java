package day05typecastingstringmanipulations;

public class Note {
    public static void main(String[] args) {

        //String manipulation

        String s ="Java is easy";

        String sUpper = s.toUpperCase();
        System.out.println(sUpper); // JAVA IS EASY

        String sLower = s.toLowerCase();
        System.out.println(sLower); // java is easy

       char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        char secondChar = s.charAt(1);//a
        char secondLastChar = s.charAt(10);

        System.out.println(secondChar); //a
        System.out.println(secondLastChar); //s

        System.out.println(""+ secondLastChar+ secondChar); // s a

        int sLength = s.length();
        System.out.println(sLength); // 12

        String sSub1 = s.substring(0,4);
        System.out.println(sSub1); // Java

        String sSub2 = s.substring(5,7);
        System.out.println(sSub2); // is

        String sSub3 = s.substring(8);
        System.out.println(sSub3); // easy

        boolean isExist = s.contains("money");
        System.out.println(isExist); // false

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart); // true

        boolean isBegin = s.startsWith("i", 5);
        System.out.println(isBegin);





    }
}
