package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    //Example 1: Integer bir list olusturunuz
//          List'e 5 tane eleman ekleyiniz.
//          Bu elemanlardan 12'yi siliniz
    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<Integer>();

        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);

        //Note : siz java'da tamsayi yazdiginizda, java o tamsayinin data type'ini
        //"primitive int " kabul ediyor, bu yuzden remove () method'unun icinde yazdiginiz tam
        // eleman olarak gostermenin bir kac yolu vardir.

        //1.yol
        // Integer nonPrimitive =12;
        //  ages.remove(nonPrimitive);

        //2.yol recommended
         ages.remove((Integer)12);

        //3.yol
        //ages.remove(Integer.valueOf(12));

        //4.yol
        //ages.remove(ages.indexOf(12));

        System.out.println(ages);

        //Example 2:Integer bir list olusturunuz.
//         List'e 5 tane eleman ekleyiniz
//         Bu elemanlardan 12'yi siliniz.

        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);

        System.out.println(nums);
//removeAll() kullanmak icin yeni bir array olusuturup silmeyi dusunduklerimizi onun icine
// koymamiz gerekiyor

        nums.removeAll(silinecekler);

        System.out.println(nums);
    }
}
