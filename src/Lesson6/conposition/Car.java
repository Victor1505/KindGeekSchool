package Lesson6.conposition;

public class Car {

    private String brand;

    private Engine engine;


    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void ride(){
        engine.start();
        System.out.println("ride...... ");
    }
}
