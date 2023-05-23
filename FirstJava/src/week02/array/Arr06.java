package week02.array;

public class Arr06 {
    public static void main(String[] args) {
        //가변배열
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        int[][] array2 = {
                {10, 20},
                {90, 40, 70, 40},
                {10}
        };

        for (int i=0; i< array2.length; i++){
            for(int j=0; j<array2[i].length; j++){
                System.out.println(array2[i][j]);
            }
        }
    }
}
