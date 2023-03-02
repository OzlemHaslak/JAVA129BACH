package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoopYildizUcgen {
    public static void main(String[] args) {
        /*
        asagida gordugunuz sekli console 'a yazdirian kodu olusturunuz

       x x x x x
       x x x x x
       x x x x x

         */
        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisini giriniz...");
        int row = input.nextInt();

        System.out.println("Sutun sayisini giriniz...");
        int column = input.nextInt();

        for(int i = 1; i <=row; i++) {
            for(int j = 1; j <= column; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

        System.out.println("satir sayisini giriniz...");

        int row1 = input.nextInt();

        for(int i = 1; i<= row; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        /*
                Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
 */
        System.out.println("satir sayisini giriniz...");

        int row2 = input.nextInt();

        for (int i = 1 ; i <=row ; i++) {
            for (int j = row2; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
