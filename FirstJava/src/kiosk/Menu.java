package kiosk;

import java.util.Scanner;

public class Menu {
    public String menuName;
    public String menuDesc;
    public void setMainMenu(){
        System.out.println("[ Menu ]");
        System.out.println(" 1. Burgers        | 앵거스 비프 통살을 다져만든 버거");
        System.out.println(" 2. Frozen Custard | 매장에서 신선하게 만드는 아이스크림");
        System.out.println(" 3. Drinks         | 매장에서 직접 만드는  음료");
        System.out.println(" 4. Beer           | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println("");

        System.out.println("[ Order Menu ]");
        System.out.println(" 5. Order     | 장바구니를 확인 후 주문합니다");
        System.out.println(" 6. Cancel    | 진행중인 주문을 취소합니다");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int menuNumber = Integer.parseInt(input);

        setCategori(menuNumber);
    }

    public void setCategori(int n){

    }


}
