package day10switchloops;

import java.util.Scanner;

public class switch3 {
    /*   Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
                Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ulke adini giriniz");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()) {

            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("India");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("bu ulke tanimli degildir");
        }

    }
}
