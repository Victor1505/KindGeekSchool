package lesson11;

import lesson10.zooclub.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


//        File file = new File("text.txt");
//        file.createNewFile();

//        FileOutputStream fos = new FileOutputStream("text.txt", true);
//        byte [] name ={86,105 };
//        fos.write(name);
//        fos.close();

//        FileInputStream fis = new FileInputStream("text.txt");
//        int nextChar = fis.read();
//        while (nextChar !=1){
//            System.out.println((char) nextChar);
//            nextChar = fis.read();
//        }
//        System.out.print((char)fis.read());
//        System.out.print((char)fis.read());
//        System.out.print((char)fis.read());
//        fis.close();

//        FileWriter fileWriter = new FileWriter("text.txt");
//        fileWriter.write("hello");
//        fileWriter.flush();
//        fileWriter.close();

//        FileReader fileReader = new FileReader("text.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        System.out.println(fileReader.read());
//        fileReader.close();

        Person person =new Person("Bob", "Bober");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();
        byte [] myOblect = byteArrayOutputStream.toByteArray();

//        change person
        person.setLastName("QWERTY");
        System.out.println(person);

        // deserializable
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(myOblect);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        //revert person
        person = (Person) objectInputStream.readObject();
        System.out.println(person);
        objectInputStream.close();

    }
}
