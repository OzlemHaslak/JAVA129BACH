package day02datatypesmethodcreation;

public class Exercice {
    public static void main(String[] args) {


        int alan = dikdortgenAlani(2, 5);
        System.out.println(alan);

        int cevre = dikdortgenCevresi(8, 9);
        System.out.println(cevre);

        double cevresi = daireninCevresi(10);
        System.out.println(cevresi);

        double alanid = daireninAlani(12);
        System.out.println(alanid);


    }

    //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz

    public static int dikdortgenAlani(int a, int b) {
        return (a * b);
    }

    //2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

    public static int dikdortgenCevresi(int a, int b) {
        return ((a + b) * 2);
    }
    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

    public static double daireninCevresi(int a) {
        return (a * 3.14 * 2);
    }

    //4)Dairenin alaninio hesaplayan methodu olusturunuz ve kullaniniz

    public static double daireninAlani(int a) {
        return (a * a * 3.14);
    }
}
