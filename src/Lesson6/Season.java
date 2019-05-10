package Lesson6;

public enum Season {

        SUMMER(27), AUTUMN(16), WINTER(-3), SPRING(15);

        private int avgC;

    Season(int avgC) {
        this.avgC = avgC;
    }

    public int getAvgC() {
        return avgC;
    }

    public void setAvgC(int avgC) {
        this.avgC = avgC;
    }
}
