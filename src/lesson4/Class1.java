package lesson4;

public class Class1 {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("");
//        person.setAge();
//        person.sayName();

//        Tester tester = new Tester("Ostap", 22, 100);
//        tester.sayAge();
//        tester.mySalary();
//        tester.test("medme");
//        tester.mySalary();
//
//        Programmer programmer = new Programmer("Den",20,100);
//        programmer.sayAge();
//        programmer.code(500, "Halk");

        Worker tester =new Tester("Ivan",33,100);
        Worker programmer = new Programmer("Petro", 30,100);
        tester.work();
        programmer.work();
    }
}
