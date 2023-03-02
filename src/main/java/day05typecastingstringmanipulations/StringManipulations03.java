package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

            /*
          Example 1: Asagıdaki kurallara gore kullanıcının girdiği password u kontrol ediniz
          1) En az 8 karakter olsun
          2) Space karakteri password de olmasin
          3) En az bir tane buyuk harf olsun
          4) En az bir tane kucuk harf olsun
          5) En az bir tane sembol olsun
          6) En az bir tane rakam olsun
         */


        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz ...");
        String pwd=input.nextLine();

        Boolean first = pwd.length()>7;

        Boolean second = !pwd.contains(" ");

        Boolean third = pwd.replaceAll("[^A-Z]","").length()>0;


        Boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;


        Boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;


        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;


        System.out.println("Password gecerli mi ? " + (fifth && second && third && fourth && fifth && sixth));
    }
}
