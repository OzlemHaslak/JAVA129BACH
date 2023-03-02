package day11forloop;

public class ForLoop03IsimTersYazdirma {
    public static void main(String[] args) {

        //Example1: size verilen bir String'i tersten yazdiriniz

        String o = "Ozlem haslak cakir";

        String p = "";

        for (int i = o.length()-1; i >= 0; i--) {
            p = p + o.charAt(i);

        }
        System.out.println(p);

    }

}
