package homework;

public class Task6_L2 {
    public static void main(String[] args) {

        int a=0, b=1, res;
        for (int i = 0; i<11; i++) {
            res = a+b;
            System.out.println(res + " ");
            b=a;
            a=res;

        }

    }
}
