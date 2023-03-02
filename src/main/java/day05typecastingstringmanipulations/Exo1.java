package day05typecastingstringmanipulations;

import java.util.Scanner;

public class Exo1 {
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

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir pasword giriniz");

        String pw = input.nextLine();

        boolean first = !pw.contains(" ");

        boolean second = pw.length() > 7;

        boolean third = pw.replaceAll("[^a-z]", "").length() > 0;

        boolean fourth = pw.replaceAll("[^A-Z]", "").length() > 0;

        boolean fifth = pw.replaceAll("[^0-9]", "").length() > 0;

        boolean sixth = pw.replaceAll("[^a-zA-Z0-9]", "").length() > 0;

        System.out.println("paswordunuz gecerli " + (fifth && second && third && fourth && sixth));

        int w = 15;
        Integer newW = w;

        System.out.println(newW);

        char d = 'r';
        Character e = d;

        System.out.println(e);


        String isim ;
        boolean ogrenciMi ;
        int not ;
        double ortalama;

        isim ="mehmet";
        ogrenciMi = false;
        not = 85;
        ortalama = 78.3;

    int level, yas, maas;
    level = 5;
    yas = 20;
    maas = 10000;

    int levele = 5, yase =20,me =10000;

    int  x = 15;
    int y = 20;

    x = x+y;
    y=x-y;
    x=x-y;

        System.out.print(x+" "+y);


    }
}
