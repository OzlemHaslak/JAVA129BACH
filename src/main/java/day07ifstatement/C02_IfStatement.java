package day07ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    //Kullanici gun numarasini girsin kod gun ismini yazsin
//  1 ==> Pazar 2 ==>Pazartesi    5== >Persembe... 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir gun isminizi giriniz...");
        
        byte gunsayisi = input.nextByte();

        if (gunsayisi == 1 ){
            System.out.println("Pazar");
        }else if (gunsayisi == 2 ){
            System.out.println("pazartesi");
        } else if (gunsayisi == 3) {
            System.out.println("sali");
        }else if (gunsayisi == 4){
            System.out.println("carsamba");
        }else if (gunsayisi == 5){
            System.out.println("persembe");
        } else if (gunsayisi == 6) {
            System.out.println("cuma");
        }else
        System.out.println("cumartesi");

    }
}
