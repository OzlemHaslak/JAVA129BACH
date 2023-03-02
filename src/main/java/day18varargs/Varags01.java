package day18varargs;

public class Varags01 {

    public static void main(String[] args) {


        /*
        Farkli sayida datalar ile calisabilmek icin varargslar olusturulmustur
        Farkli parametreleer ile calisabilen methodlar olusturmak icin varargs'lar kullanilir

        Varargs'larin arka tarafinda Array'ler calisir

        Varargs nasil olusturulur.( Data type...  varargs ismi) veya ( Data type  ...varargs ismi)
        Varargs en sonda olmak sartiyla  bir method olustururken farkli data type'lari kullanilabilir****
        Varargs 'lar bir methodda birden fazla kullanilamaz==unreachable code olur

         */


        ikiSayiyiTopla(2,3);

        ucSayiyiTopla(6,8,14);
        dortSayiyiTopla(56,96,40,30);

    }

    private static void  dortSayiyiTopla(int i, int i1, int i2, int i3) {
        System.out.println((i+i1+i2+i3));
    }

    private static void  ucSayiyiTopla(int i, int i1, int i2) {
        System.out.println(i+i1+i2);
    }

    private static int ikiSayiyiTopla(int i, int i1) {
        return 1+i1;
    }
    private static  int add(int...a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;

        }
        return sum;
    }
    }
