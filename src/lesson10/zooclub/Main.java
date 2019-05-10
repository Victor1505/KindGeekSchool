package lesson10.zooclub;

import lesson7.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status) {
            System.out.println("Оберіть пункт меню 1-6.");
            int key = sc.nextInt();
            switch (key) {
                case 1: {
                    persons.forEach(System.out::println);
                    break;
                }
                case 2: {
                    System.out.println("Введіть ім'я нового учасника");
                    String fName = sc.next();
                    System.out.println("Введіть прізвище нового учасника");
                    String lName = sc.next();
                    persons.add(new Person(fName, lName));
                    break;
                }
                case 3: {
                    addPetToPerson(sc, persons);
                    break;
                }
                case 6: {
                    System.out.println("OFF");
                    status = false;
                    break;
                }
            }

        }

    }

    private static void addPetToPerson(Scanner sc, List<Person> persons) {
        System.out.println("Введіть ім'я  учасника");
        String fName = sc.next();
        System.out.println("Введіть прізвище  учасника");
        String lName = sc.next();
        Person currentPerson = null;
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person personFromIterator = iterator.next();
            if (personFromIterator.getFirstName().equals(fName) && personFromIterator.getLastName().equals(lName)) {
                currentPerson = personFromIterator;
                break;
            }
        }
        System.out.println("Введіть ім'я peta");
        String nick = sc.next();
        System.out.println("Тип пета");
        PetType petType = PetType.getPetType(sc.next());
        if (currentPerson != null) {
            currentPerson.addPet(new Pet(petType, nick));
        } else {
        }
    }
}