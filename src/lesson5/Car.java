package lesson5;

public class Car implements TransportInterface {

    private String name;
    private int power;

    public Car(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public void drive(){
        System.out.println("Transport drive on 4 wheels.....");
    }
}
