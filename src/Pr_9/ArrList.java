package Pr_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class ArrList {
    public static void main(String[] args) {

        String saturn = new String("Сатурн");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");

        java.util.ArrayList<String> solarSystem1 = new java.util.ArrayList<>(Arrays.asList(saturn, venus, earth));
        List<String> solarSystem2 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(saturn, venus, earth, mars, jupiter)));

        solarSystem1.add("mercury");// add element
        System.out.println("1. SolarSystem1 after adding one elements:" + solarSystem1);

        solarSystem1.remove("mercury");// delete element
        System.out.println("2. SolarSystem1 after removing one elements:" + solarSystem1);

        solarSystem1.set(1, "jupiter");// change element
        System.out.println("3. SolarSystem1 after changing one elements:" + solarSystem1);

        solarSystem1.addAll(solarSystem2);//Merge both lists mixing
        System.out.println("4. Mix 2 lists:"+ solarSystem1);

        Random random = new Random();
        String foo1 = solarSystem1.get(random.nextInt(solarSystem1.size()));//choosing a random planet
        System.out.println("5.1 Random selection of element of solarSystem1: "+ foo1);
        String foo2 = solarSystem2.get(random.nextInt(solarSystem1.size()));//choosing a random planet
        System.out.println("5.2 Random selection of element of solarSystem2: "+ foo2);

        int index = solarSystem1.indexOf("Земля"); // showing the index of an element
        System.out.println("6.1 Element's index: " + index);
        int index2 = solarSystem2.indexOf("Сатурн"); // showing the index of an element
        System.out.println("6.2 Element's index: " + index2);

        if(solarSystem1.contains("C")==true)// checking if an element is in the list.
            System.out.println("Given list contains string 'C'");
        else if(solarSystem1.contains("Земля")==true)
            System.out.println("7. SolarSystem1 list contains string 'Земля' but not string 'C'");

    }
}
