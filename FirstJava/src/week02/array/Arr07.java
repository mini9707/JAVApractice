package week02.array;

public class Arr07 {
    public static void main(String[] args) {
        //최대값 구하기
        int[] arr = {3, 4, 5, 8, 1, 2};

        int max = arr[0];

        for(int num : arr) {
            if (num > max){
                max = num;
            }
        }
        System.out.println("최대값은 => " + max);
    }
}
