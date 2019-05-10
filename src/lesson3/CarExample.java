package lesson3;

public class CarExample {

    String name;
    int power;

    public CarExample(){} //конструктор за замовчуванням

    public CarExample(String nameCar, int powerCar) //коструктор  з параметрами
    {
        name = nameCar;
        power= powerCar;
    }


    //метод
    public  void ride(int speed){
        System.out.println(name + " Ride "+speed+" km/h");
//        return (int)(Math.random()*100)+20;
    }
}


