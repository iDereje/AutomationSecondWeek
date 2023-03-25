package javaTraining;


import java.util.Arrays;
import java.util.List;

public class ListTraing {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Elya", "Jorge", "Moran", "David", "Daniela", "Omar");
        for (String name : names) {
            if (name.contains("or")) {
                System.out.println(name);

            }

            if (name.equals("Omar")) {
                System.out.println("Omar Found");
            }
            if (name.equalsIgnoreCase("omar")) {
                System.out.println("Omar Found");


            }
        }

    }

}
