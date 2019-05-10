package lesson4;

public class Worker extends Person{

    private  int salary;

    public Worker(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void work(){
        System.out.println("My salary per day = "+salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
