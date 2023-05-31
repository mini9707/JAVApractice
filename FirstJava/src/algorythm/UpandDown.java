package algorythm;

import java.util.Random;
import java.util.Scanner;

public class UpandDown {
    Random random = new Random(System.currentTimeMillis());
    Scanner scanner = new Scanner(System.in);

    public void findAnswer() {
        int answer = random.nextInt(101);
        int count = 0;
        int guess;
        System.out.println("1~100 중 랜덤 숫자 하나를 정하였습니다. 과연 당신이 맞출 수 있을까요?!");

        while (true) {
            count += 1;
            guess = scanner.nextInt();

            if (guess > answer) {
                System.out.println("DOWN");
            } else if (guess < answer) {
                System.out.println("UP");
            } else {
                System.out.println("CORRECT");
                break;
            }
        }

        System.out.printf("숫자 입력한 횟수: %d번\n", count);
        scanner.close();
    }
}