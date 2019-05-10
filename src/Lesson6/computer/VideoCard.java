package Lesson6.computer;

public class VideoCard {

    private int power;

    public VideoCard(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void run(){
        System.out.println(" Video displayed ");
    }
}
