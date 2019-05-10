package lesson4;

public class Tester extends Worker{

   public Tester(String name, int age, int salary){
       super(name, age,salary);
   }

   public void mySalary(){
        System.out.println("My salary per day = "+ super.getSalary());
   }


    @Override
    public void work(){
        System.out.println("Testing.....");
        super.setSalary(super.getSalary()+10);
    }

}
