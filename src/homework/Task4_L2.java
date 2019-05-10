package homework;

import java.util.Scanner;

public class Task4_L2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        int x = scanner.nextInt();
        System.out.println("enter y");
        int y = scanner.nextInt();
        System.out.println("choose action");
        String key = scanner.next();
        switch (key)
        {
            case "+": {
                System.out.println(x+y);
                break;
            }
            case "-":{

                System.out.println(x-y);
                break;
            }
            case "/":{

                System.out.println(x/y);
                break;
            }
            case "*":{

                System.out.println(x*y);
                break;
            }
        }
    }
}
