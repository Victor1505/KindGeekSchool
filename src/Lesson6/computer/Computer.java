package Lesson6.computer;

public class Computer {


    private OperationCard operationCard;
    private Processor processor;
    private VideoCard videoCard;


    public Computer(OperationCard operationCard, Processor processor, VideoCard videoCard) {
        this.operationCard = operationCard;
        this.processor = processor;
        this.videoCard = videoCard;
    }

    public OperationCard getOperationCard() {
        return operationCard;
    }

    public void setOperationCard(OperationCard operationCard) {
        this.operationCard = operationCard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void displyVideo(){
        operationCard.run();
        processor.run();
        videoCard.run();
        System.out.println("Displaying video....");
    }
    public void displayGame(){
        videoCard.run();
        processor.run();
    }
}
