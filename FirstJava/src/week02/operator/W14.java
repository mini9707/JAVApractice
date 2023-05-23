package week02.operator;

import java.util.Scanner;

public class W14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단수를 입력하세요 : ");
        int passNum = sc.nextInt();

        for (int i = 2; i <= 9; i++){
            if(i==passNum){
                for (int j = 1; j <= 9; j ++) {
                    System.out.println(i + "*" + j + "=" + i * j);
                }
            } else continue;
        }
    }
}
