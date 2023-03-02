package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);

        List<Double> half = getHalfOfElementsGreaterThanFiveDistinctReversed(myList);

        System.out.println(half);
        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        elemanSil(list);

        System.out.println();

        elemansil2(list);

        System.out.println(
        );
        elemsil2(list);


    }
    public static void elemanSil(List<String>list){
        list.stream().distinct().map(t-> t.toUpperCase()).sorted().forEach(t-> System.out.print(t + " "));
    }

    public static List<Double> getHalfOfElementsGreaterThanFiveDistinctReversed(List<Double> myList){

       return myList.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    public static void elemansil2(List<String>list){

        list.stream().distinct().map(t-> t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));
    }
    public static void elemsil2(List<String>list){

        list.stream().distinct().map(t-> t.toUpperCase()).sorted(Comparator.comparing(t-> t.length())).forEach(t-> System.out.print(t + " "));
    }
}
