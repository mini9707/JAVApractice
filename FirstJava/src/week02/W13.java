package week02;

public class W13 {
    public static void main(String[] args) {
        //while문
//        int number = 0;
//
//        while (number < 3){
//            number++;
//            System.out.println(number + "출력");
//        }

        //do~while문
//        int number = 4;
//
//        do {
//            System.out.println(number + "출력");
//        } while (number < 3);

        //break문 (for, while, switch 중단)
//        int number = 0;
//        while (number < 3) {
//            number++;
//            if (number == 2) {
//                break;
//            }
//            System.out.println(number + "출력!!");
//        }

        //break는 속해잇는 for, switch, while 문만 빠져나온다!
//        for (int i = 0; i < 10; i++){
//            System.out.println("i : " + i);
//            if (i == 2){
//                break;
//            }
//            for (int j = 0; j < 10; j++){
//                System.out.println("j : " + j);
//                if (j == 2){
//                    break;
//                }
//            }
//        }

        //continue
        //continue를 만나면 하위 로직은 생략하고 다음 반복문으로 넘어감
        int number = 0;
        while (number < 3) {
            number++;
            if (number == 2) {
                continue;
            }
            System.out.println(number + "출력!");
        }
    }
}
