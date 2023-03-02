package day13whileloopdowhileloop;

public class ForWhileDoWhileLoop01 {
    public static void main(String[] args) {


        //soru

        int sayi = 100;
        int bolunen = 4;
        int sayac = 0;

        while (bolunen <= sayi) {
            if (sayi % bolunen == 0) {
                System.out.print(bolunen + " ");
                sayac++;

            }
            System.out.println();
            System.out.println(sayac);

        }
    }}