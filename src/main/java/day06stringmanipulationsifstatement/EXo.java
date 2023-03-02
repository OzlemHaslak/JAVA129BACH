package day06stringmanipulationsifstatement;

import java.util.Scanner;

public class EXo {
    public static void main(String[] args) {

        int a = 10;
        int b = 8;

        if (a==b) {
            System.out.println("iki sayi esit");
        }
        if (a+b<100){
            System.out.println("sayilarin toplami yusden kucuk");
        }
        if (a*b>1000){
            System.out.println("sayilarin carpimi bin den buyuk");
        }

        int c = 11;

        if (c%2==0){
            System.out.println("cift sayi");
        }else
            System.out.println("tek sayi");

        Scanner input = new Scanner(System.in);
        System.out.println("gunlerin ilk harfini verin");

        String ilkHarf = input.nextLine().toUpperCase();

        if (ilkHarf.startsWith("P")){
            System.out.println("Pazar, Pazartesi, Persembe");
        }else if(ilkHarf.startsWith("S")){
            System.out.println("Sali");
        }else
            System.out.println("carsamba, cuma, cumartesi");

        Scanner scan = new Scanner(System.in);
        System.out.println("gun ismi veriniz");

        String gunIsmi = scan.nextLine().toUpperCase();

        if (gunIsmi.equalsIgnoreCase("pazar")) {
            System.out.println("hafta sonu");
        }else if (gunIsmi.equalsIgnoreCase("cumartesi")){
            System.out.println("hafta sonu");
        }else
        System.out.println("hafta ici");

        Scanner cuma = new Scanner(System.in);
        System.out.println("bir kenar uzunlugu veriniz");

        int birkenarUzunlugu = cuma.nextInt();

        System.out.println("iki kenar uzunlugu veriniz");

        int ikinciKenarUzunlugu = cuma.nextInt();

        if(birkenarUzunlugu == ikinciKenarUzunlugu){
            System.out.println("bir karedir");
        }else
            System.out.println("bir dikdortgendir");

    Scanner sali = new Scanner(System.in);
        System.out.println("yasinizi giriniz");

        byte yas = sali.nextByte();

        if (yas >64){
            System.out.println("emekli olabilirsin");

        }else
            System.out.println("emekli olamazsin , calismalisin");

Scanner pazar = new Scanner(System.in);
        System.out.println("bir kenar giriniz");
        int birincikenar = pazar.nextInt();
        System.out.println("iki kenar giriniz");
        int ikinciKenar = pazar.nextInt();
        System.out.println("ucuncu kenar giriniz");
        int ucuncuKenar= pazar.nextInt();

        if((birincikenar == ikinciKenar)&&(ikinciKenar == ucuncuKenar)){
            System.out.println("bir eskenar ucgen");
        }else
            System.out.println("eskenar degil");
    }
}
