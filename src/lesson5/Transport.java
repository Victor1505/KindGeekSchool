package lesson5;

public abstract class Transport {

    private String name;
    private int power;

    public Transport(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public abstract void drive();

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
