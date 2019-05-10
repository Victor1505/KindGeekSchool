package Lesson5Next;

public class Programmer implements Work{

    String name;
    int age;

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void work(){
        System.out.println("Programmer code");

    }


}
