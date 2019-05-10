package homework;

public class Task7_L2 {


        public static void main(String[] args) {

            int[] arr = new int[15];

            for (int i = 0; i<15; i++){
                arr[i] = (int)(Math.random()*10);
                System.out.print(arr[i]+" ");
            }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
            int a=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0)
                    continue;
                if (arr[i]%2 == 0)
                    a++;
            }
            System.out.println();
            System.out.println(a);

        }
}
