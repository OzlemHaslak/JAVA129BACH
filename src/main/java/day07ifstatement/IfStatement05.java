package day07ifstatement;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen ay ismi giriniz");

        String monthName = input.next();

        if (monthName.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (monthName.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (monthName.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (monthName.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (monthName.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (monthName.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (monthName.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (monthName.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (monthName.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (monthName.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (monthName.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Invalid month name...");
        }

        int a = 16;
        System.out.println((a%2==0 ) ? "positif" :  "negatif");
    }

}