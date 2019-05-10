package lesson10;

import lesson4.Person;
import lesson5.Car;

public class Main {

    public static void main(String[] args) {
//        Box<Person> box = new Box<Person>(new Person("Ivan",13));
//        box.setObject(new Person("Petro", 12));

        Box<Person, Car> box = new Box<Person, Car>(new Person("Bob", 33), new Car("BMW", 55));
    }
}
