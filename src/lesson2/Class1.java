package lesson2;

import java.util.Scanner;

public class Class1 {

        public static void main(String[] args) {

        String string = "Hello World";
        System.out.println(string.charAt(1));
        System.out.println(string.isEmpty());

        Scanner scanner = new Scanner(System.in);
//        String text1 = scanner.nextLine();
//        int x = scanner.nextInt();
        String key =  scanner.next();
        switch (key){
            case "q":{
                System.out.println("Ви обрали пунлт 0");
                break;
            }
            case "w":{
                System.out.println("Ви обрали пунлт 1");
                break;
            }
            case "e":{
                System.out.println("Ви обрали пунлт 2");
                break;
            }
            default:{
                System.out.println("Error");
            }
        }
//
//
//
//        int i = 1;
//        while (i<10){
//            System.out.println(i);
//            i+=2;
//        }
//        int i = 0;
//        do{
//            System.out.println(i);
//            i+=2;
//        }while (i < 10);

//        for (int i = 0; i<10; i+=2 ){
//            System.out.println(i);
//        }
//        int x = 2;
//        int i = 4;
//        while (i++){
//            System.out.println(x);
//            x*=2;
//        }
//        int i =2;
//        int fix = i;
//        for (int l=0; l<5; l++){
//            System.out.println(i);
//            i*=fix;
//        }

//        int [] arr = {23, 34, 132, 5};
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        int [] arr = new int[10];
//        for (int i =0; i<arr.length; i++){
//            arr[i] = (int)(Math.random()*10)+5;
//            System.out.print(arr[i] + " ");
//        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        }
}
