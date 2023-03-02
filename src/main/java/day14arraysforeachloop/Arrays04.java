package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {

        //Example 1: String bir array olusturunuz 6 eleman ekleyiniz, Yellow'dan onceki elemanalari
        //yazdiriniz

        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for (String w : colors) {
            if(w.equals("Yellow")){
                break;
            }
            System.out.println(w);

        }
        System.out.println("********************************");
        //

        for (int i =colors.length-1; i >=0 ; i--) {
            if(colors[i].equals("Yellow")){
                break;
            }
            System.out.println(colors[i]);
        }
        //Bazen kitleniriz ve  for- each-loop kullanamayiz.Bu soruda tersten baslamaliyiz
        // halbu ki  for- each-loop her zaman bastan baslar.O yüzden burda for-loop
        // kullanmak zorundayiz.
            }
        }

