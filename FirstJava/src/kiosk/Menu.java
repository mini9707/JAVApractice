package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu{
    static ArrayList<String> menuList = new ArrayList<String>();
    static ArrayList<String> menuDesc = new ArrayList<String>();

    Scanner s = new Scanner(System.in);
    static{
        menuList.add("Burgers");
        menuList.add("Chickens");
        menuList.add("Drinks");
        menuList.add("Dessert");
        menuDesc.add("참깨빵위에 순쇠고기 패티두장 특별한 소스 양상추...");
        menuDesc.add("매장에서 직접 튀기는 바삭한 치킨");
        menuDesc.add("매장에서 직접 만드는 음료");
        menuDesc.add("치즈스틱, 감자튀김, 빙수 등등");
    }

    public int Menu() {
        System.out.println();
        showMainMenu();
        Integer num = Integer.parseInt(s.nextLine());
        return num;
    }

    public void showMainMenu() {
        System.out.println("Lotte Lia 에 오신걸 환영합니다");
        System.out.println("아래 상품 메뉴판을 보시고 상품을 골라 입력해주세요");
        System.out.println("");
        System.out.println("[ LOTTE RIA MENU ]");
        for (int i=0; i<menuList.size(); i++){                          //리스트 사이즈 주의  <= , <
            System.out.println((i+1)+"."+menuList.get(i)+"|"+menuDesc.get(i));
        }
        System.out.println("");
        System.out.println("[ ORDER MENU ]");
        System.out.println("5.ORDER  | 장바구니를 확인 후 주문합니다");
        System.out.println("6.CANCEL | 진행중인 주문을 취소합니다");
    }
}
