package lesson9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws WrongInputDataException {
//        int arr [] =  {22,34,2314,43};

//        try {
//            FileInputStream fis = new FileInputStream("text.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        CHECKED ERROR


//        try {
//            arr[5] = 10;
//            System.out.println(arr[5]);
//        }catch (ArrayIndexOutOfBoundsException exception){
//            System.out.println("Такого індекса не існує");
//        }
//        System.out.println(arr[2]);
//        UNCHECKED EXAPTION

//        try {
//            getFile("text.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println();
//        }
//    }
//
//    public static void getFile(String pathToFile) throws FileNotFoundException {
//        FileInputStream fis = new FileInputStream(pathToFile);
//    }
//
//     public static void getFile2(String pathToFile) throws FileNotFoundException {
//        getFile(pathToFile);
//     }

//        int personID =2;
//        if(personID >100){
//            throw new WrongInputDataException("Person with id"+personID+"not found");
//        }

        calculate(0, 0);


    }
    public static void calculate(int a, int b) throws WrongInputDataException {
        if (a==b && a!=0){
            throw new WrongInputDataException("EEEEEEEEERRRRRRRRERE");
        }
        if (a==0 && b==0){
            throw new WrongInputDataException("ERRRRRRRRRER");
        }
        if (a<0 && b<0){
            throw new WrongInputDataException("ERErerere");
        }
        System.out.println("result ->" + (a + b));
    }
}
