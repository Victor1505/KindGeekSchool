package lesson3;

public class OOP {

    public static void main(String[] args){

        CarExample car1 = new CarExample("BMW",245); //конструктор написаний

        car1.ride(50);

        CarExample car2 = new CarExample(); //конструктор за замовчуванням
        car2.name = "Porshe";
        car2.power = 500;

        car2.ride(100);


//        AnimalsExample animals1 = new AnimalsExample("Dog", 10);
//        animals1.run(12);
//
//        AnimalsExample animals2 = new AnimalsExample();
//        animals2.name = "Cat";
//        animals2.waight = 10;
//
//        animals2.run(20);

    }
}
