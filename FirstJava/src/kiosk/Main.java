package kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("어서오세요 ~에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println("");

        Menu menu = new Menu();
        menu.setMainMenu();
    }
}
