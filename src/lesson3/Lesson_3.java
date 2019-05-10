package lesson3;

public class Lesson_3 {

    public static void main(String[] args){
        int [][] arr = new int[3][3];
        arr[0][0] = 33;

        for(int i=0; i<3; i++){

            for (int j = 0; j<3; j++){
                arr[i][j] = (int)(Math.random()*100)+2;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
