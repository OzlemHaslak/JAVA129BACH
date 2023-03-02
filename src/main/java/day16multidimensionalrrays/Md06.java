package day16multidimensionalrrays;

import java.util.Arrays;

public class Md06 {
    public static void main(String[] args) {

        //

        int a[][] = { {21, 5}, {14, 70, 11} };

        int small = a[0][0];
        int big = a[0][0];

        for (int [ ] w : a) {
            for (int k : w) {

               small =  Math.min(small,k);
               big = Math.max(big,k);

                             ;

            }
        }
        System.out.println(small+big);




        // Bu kodda, 'arr' değişkeni verilen çok boyutlu dizi için tanımlanmıştır.
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};

        int sonuc = 1;

// Çok boyutlu dizi içinde dönüyoruz ve her bir alt dizinin son elemanını bulmak için bir döngü oluşturuyoruz.
        for (int[] w: arr) {
            sonuc *= w[w.length - 1];
        }

// Sonucu ekrana yazdırıyoruz
        System.out.println(sonuc);


        int e[][]= {{1,2,3},{4,5},{6,7}};
        
        int totalElement = 0;



        for (int [] w : e) {
            totalElement=totalElement+w.length;
            System.out.println(totalElement);
        }
        int i[] = new int [totalElement];

        int idx = 0;

        for( int[]w:e) {
            for(int k:w){
                i[idx]=k;
                idx++;
            }

        }
        System.out.println(Arrays.toString(i));





        }
    }

