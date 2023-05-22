package week02;

import java.util.Objects;
import java.util.Scanner;

public class W10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A 입력 : ");
        String aHand = sc.nextLine();

        System.out.println("B 입력 : ");
        String bHand = sc.nextLine();

        if (Objects.equals(aHand, "가위")){
            if (Objects.equals(bHand, "가위")){
                System.out.println("A와 B는 비겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("B가 이겼습니다.");
            } else {
                System.out.println("A가 이겼습니다.");
            }
        } else if (Objects.equals(aHand, "바위")) {
            if (Objects.equals(bHand, "가위")){
                System.out.println("A가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A와 B는 비겼습니다.");
            } else {
                System.out.println("B가 이겼습니다.");
            }
        } else {
            if (Objects.equals(bHand, "가위")){
                System.out.println("B가 이겼습니다.");
            } else if (Objects.equals(bHand, "바위")) {
                System.out.println("A가 이겼습니다.");
            } else {
                System.out.println("A와 B는 비겼습니다.");
            }
        }


    }
}
