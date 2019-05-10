package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "12"));
        persons.add(new Person("Ivan", "12"));
        persons.add(new Person("Petro", "12"));
        persons.add(new Person("Aterd", "12"));
        persons.add(new Person("Aterd", "12"));

        for (int i = 0; i <persons.size(); i++){
            Person person = persons.get(i);
            if(person.getFirstName().equals("Petro")){
                persons.remove(person);
                break;
            }
        }



        for (int i =0; i < persons.size(); i++){
            Person person = persons.get(i);
            System.out.println("Name: "+ person.getFirstName()+" SurName : "+person.getLastName());
        }


//        List<Long> list1 = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++) {
//        list1.add((long)((Math.random()*4001)+1000));
//        }
//        System.out.println(list1);
//
//        for (int i = 0; i < 100; i++) {
//            if (list1.get(i) > 4000){
//                System.out.print(list1.get(i) + "  ");
//            }
//        }




//        List<Integer> list1 = new ArrayList();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        System.out.println(list1);
//        System.out.println(list1.get(2));
//        System.out.println(list1.size());
//        System.out.println(list1.contains(0));

    }

}
