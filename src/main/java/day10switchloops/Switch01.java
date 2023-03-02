package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen ayin kacinci ay oldugunu giriniz...");

        int mois = input.nextInt();

        switch (mois) {
            case 1:
                System.out.println("Janvier");
            case 2:
                System.out.println("fevrier");
            case 3:
                System.out.println("mars");
            case 4:
                System.out.println("avril");
            case 5:
                System.out.println("mai");
            case 6:
                System.out.println("juin");
            case 7:
                System.out.println("juillet");
            case 8:
                System.out.println("aout");
            case 9:
                System.out.println("septembre");
            case 10:
                System.out.println("octobre");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("decembre");
                break;
            default:
                System.out.println("gecerli ay numarsi veriniz");
        }
// note : "switch de  1. string 2. int 3. byte 4. short 5. char kullanilabilir
//        "switch de  1. long  2. boolean  3. float  4.double  kullanilamaz
    }
}
