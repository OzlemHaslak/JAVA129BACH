package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //   Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        // 3==> 3x1=3  3*2=6 3*3=9 3*4=12    3*10=30
        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz...");
        int num = input.nextInt();

        int i = 1;

        while (i < 11) {

            System.out.println(num + "x" + i + "=" + (num * i));

            i++;
        }
        //Example2 : verilen bir string de her harfin sonrasina "*" sembolu ekleyin

        System.out.println("bir kelime giriniz...");
        String word = input.next();

        String newWord = "";

        for (int j = 0; j < word.length();j++) {
            newWord=newWord+word.charAt(j)+"*";
            System.out.println(newWord);


            String newWord1 = "";

            int k = 0;
            while (k<word.length()){

               newWord1= newWord1+word.charAt(k)+"*";

                k++;
            }
            System.out.println(newWord1);

        }
    }
}