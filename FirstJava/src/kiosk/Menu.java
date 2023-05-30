package kiosk;

import java.util.Scanner;

public class Menu {
    public String menuName;
    public String menuDesc;
    public void showMainMenu(){
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

        switch (menuNumber){
            case 1:
                showBurgers();
                break;
            case 2:
                showFrozenCustard();
                break;
            case 3:
                showDrinks();
                break;
            case 4:
                showBeer();
                break;
            default:
                System.out.println("잘못입력하셨습니다");
                break;
        }
    }

    public void showBurgers(){
        System.out.println("[ Burgers MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        System.out.println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
    }

    public void showFrozenCustard(){
        System.out.println("[ Frozen Custard MENU ]");
        System.out.println("1. Classic Shacks  | W 6.2 | 쫀득하고 진한 커스터드가 들어간 클래식 쉐이크");
        System.out.println("2. Floats          | W 6.2 | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료");
        System.out.println("3. Frozen Custard  | W 5.2 | 매일 신선하게 제조하는 쫀득하고 진한 아이스크림");

    }

    public void showDrinks(){
        System.out.println("[ Drinks MENU ]");
        System.out.println("1. Lemonade   | W 4.1 | 매장에서 직접 만드는 레몬에이드");
        System.out.println("2. Coke       | W 2.8 | 코카콜라");
        System.out.println("3. Hot Tea    | W 3.4 | 녹차");
    }
    public void showBeer(){
        System.out.println("[ Beer MENU ]");
        System.out.println("1. TERRA | W 5.0");
        System.out.println("2. CASE  | W 5.0");
    }
}
