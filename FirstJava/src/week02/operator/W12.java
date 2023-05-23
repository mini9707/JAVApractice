package week02.operator;

public class W12 {
    public static void main(String[] args) {

//        for (int i = 1; i < 5; i++){
//            System.out.println(i + "번째 출력");
//        }

        //향상된 for문
//        int[] arrNumber = {3, 6, 9, 12, 15};
//        for (int number : arrNumber) {
//            System.out.println(number+"");
//        }

        //향상된 for문을 일반 for문으로 표현한다면?
        int[] numbers = {3,6,9,12,15};
        for(int i = 0; i <numbers.length; i++){
            System.out.println(numbers[i] + "");
        }

    }
}
