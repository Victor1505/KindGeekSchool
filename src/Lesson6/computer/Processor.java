package Lesson6.computer;

public class Processor {

    private int power;

    public Processor(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void run(){
        System.out.println("Processor started");
    }
}
