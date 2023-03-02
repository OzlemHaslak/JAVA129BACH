package day11forloop;

public class ForLoop04SayiToplami {
    public static void main(String[] args) {

        //Example 1: 5 den 8 'e kadar tamsayilarin toplamini veren kodu yaziniz
        //           5  +  6  +  7 + 8 ==> 36

        int sum = 0;

        for (int i = 1; i < 9 ; i++) {

            sum = sum+ i ;
        }
        System.out.println(sum);

        //Example 2: 7' den 9'a kadar tamsayilarin carpimini veren kodu yaziniz


        int multiply = 1;

        for (int i = 7; i < 10 ; i++) {
            multiply = multiply* i ;
        }
        System.out.println(multiply);
    }
}
