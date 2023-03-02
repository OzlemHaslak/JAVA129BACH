package day16multidimensionalrrays;

public class Md05 {
    public static void main(String[] args) {
        //Example 1: Bir integer multi-dimensional array olusturunuz
//           Bu array'deki tum elemanlarin carpimini console'a yazdiran kodu yaziniz


//        int a[][] = {{5,8,4},{18,8},{84,4}};
//        int carpim = 1;
//
//        for(int [] w : a){
//            for ( int k : w ){
//
//                carpim = carpim *k;
//            }
//        }
//        System.out.println(carpim);

        int b[][] = {{1,2,3},{4,5,6}};

        int carpim = 1;

        for (int [] w : b){
            for(int k : w)
            {

                carpim = carpim*k;
            }

        }
        System.out.println(carpim);

    }
}
