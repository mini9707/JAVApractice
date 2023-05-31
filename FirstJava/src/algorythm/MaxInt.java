package algorythm;

public class MaxInt {
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<=array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}