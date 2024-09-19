import models.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Dictionary
        Map<Integer, String> dictionary = new HashMap<Integer, String>();

        //Add elements to the dictionary
        dictionary.put(1, "Johan");
        dictionary.put(2, "Silvio");
        dictionary.put(22020330, "Andrés");
        dictionary.put(4, "Douglas");
        dictionary.put(5, "César");
        dictionary.put(6, "Gabriel");

        //Print the dictionary
        System.out.println(dictionary.get(22020330));

        Map<String, String> dictionary2 = new HashMap<String, String>();
        dictionary2.put("Johan", "Reyes");
        dictionary2.put("Silvio", "Mora");
        dictionary2.put("Andrés", "Martínez");
        dictionary2.put("Douglas", "Gómez");

        System.out.println(dictionary2.get("Silvio"));

        Map<String, Person> list = new HashMap<String, Person>();
        list.put("Johan", new Person("Johan", "Reyes"));
        list.put("Silvio", new Person("Silvio", "Mora"));
        list.put("Andrés", new Person("Andrés", "Martínez"));

        System.out.println(list.get("Andrés"));
    }
}