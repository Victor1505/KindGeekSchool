package lesson4;

public class Programmer extends Worker{


    public Programmer(String name, int age, int salary) {
        super(name, age, salary);

    }
    public void mySalary(){
        System.out.println("My salary per day = "+ super.getSalary());
    }

    @Override
    public void work(){
        System.out.println("Programming...");
        super.setSalary(super.getSalary()+10);
    }
}


