package homework;

public class Task8_L2 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*90)+10;
            System.out.print(arr[i] + " ");

        }
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            if(a<arr[i])
                a = arr[i];

        }
        System.out.println();
        System.out.println(a);
    }
}
