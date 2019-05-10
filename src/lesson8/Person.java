package lesson8;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person>{

    private String name;
    private Integer age;
    private Set<Set> pets;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pets = new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return age != null ? age.equals(person.age) : person.age == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) == 0) {
            if (this.age > person.age) {
                return 1;
            } else if (this.age < person.age) {
                return -1;
            } else {
                return 0;
            }
        }else {return this.name.compareTo(person.name);

        }
    }
}
