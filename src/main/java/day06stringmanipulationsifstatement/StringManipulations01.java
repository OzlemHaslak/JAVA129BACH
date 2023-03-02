package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
        //             "   Ali Can   "     ==>      "Ali Can"
        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);// 456.99

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);// 875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98


        String name = "  ali caN ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);
        System.out.println(""+first+second);

        String str = "";

       boolean result1 = str.length() == 0;
        System.out.println("String bos mu ? " + result1);

        boolean result2=str.isEmpty();
        System.out.println("String bos mu? " + result2);

        String t = "  ";

        boolean result3=t.replace(" ","").length()==0;
        System.out.println("sadece space mi var ?" + result3);

        boolean result4=t.isBlank();

        System.out.println(result4);




    }

}
