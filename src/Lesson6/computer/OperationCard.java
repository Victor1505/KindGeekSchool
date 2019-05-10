package Lesson6.computer;

public class OperationCard {

    private int power;

    public OperationCard(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void run(){
        System.out.println("Operation card started");
    }
}
