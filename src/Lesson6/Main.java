package Lesson6;

public class Main {

    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.name());
        System.out.println(season.ordinal());

        Season[] seasons = Season.values();
        for (int i=0; i<4; i++){
            System.out.println("№ " +seasons[i].ordinal()+" "+seasons[i].name().toLowerCase());
            System.out.println("Avg C -> "+ seasons[i].getAvgC());
        }
    }
}
