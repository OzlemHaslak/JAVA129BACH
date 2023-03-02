package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {

        //Example 1: Verilen bir String de 'a' character'leri yazdiriniz
        //           "Madagaskar" ==> Mdgskr

        String s = "Madagaskar";

        // 1.Yol :
        String t = s.replace("a","");
        System.out.print(t);//Mdgskr

        System.out.println();
        // 2.Yol :
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c != 'a'){
                System.out.print(c);
            }
        }
        System.out.println();
        // 3.Yol :
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch=='a'){
                continue;
            }
            System.out.print(ch);
        }
    }
}
