package lesson8;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {




        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Ivan", 18));
        persons.add(new Person("Artem", 13));
        System.out.println(persons);

        Iterator<Person> iter = persons.iterator();
        while(iter.hasNext()){
            if (iter.next().getName().equals("Petro")){
                iter.remove();
            }
        }
//        System.out.println(persons);

//        Map<Integer, List<String>> map = new TreeMap<>();
//        map.put(1, Arrays.asList("one", "Ene"));
//        map.put(2, Arrays.asList("two", "Zwei"));
//        map.put(3, Arrays.asList("three", "Drei"));
//        System.out.println(map);
//
//        System.out.println(map.get(2));
//        System.out.println(map.keySet());
    }
}
