package lesson5;

public class Motobike implements TransportInterface {

    private String name;
    private int power;

    public Motobike(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public void drive(){
        System.out.println("Transport drive on 2 wheels.....");
    }
}
