package Lesson6.computer;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer( new OperationCard(12), new Processor(23), new VideoCard(54));
        computer.displyVideo();


    }
}
