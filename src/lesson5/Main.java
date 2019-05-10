package lesson5;

public class Main {
    public static void main(String[] args) {

//        System.out.println(MyMath.pi);
//        MyMath.pi = 3.9999;
//        MyMath.getNumber();

        Motobike motobike = new Motobike("Ducati",110);
        Car car = new Car("BMW", 120);
        motobike.drive();
        car.drive();
    }
}
