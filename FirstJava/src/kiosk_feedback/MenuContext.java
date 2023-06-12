package kiosk_feedback;

import java.util.ArrayList;
import java.util.List;

public class MenuContext {

    private void initializeMenuItems(){
        List<Menu> mainMenus = new ArrayList<>();
        mainMenus.add(new Menu("burgers","참깨빵위에 순쇠고기 패티두장 특별한 소스 양상추.."));
        mainMenus.add(new Menu("Chickens","매장에서 직접 튀기는 바삭한 치킨"));
        mainMenus.add(new Menu("Drinks","매장에서 직접 만드는 음료"));
        mainMenus.add(new Menu("Dessert","치즈스틱, 감자튀김, 빙수 .."));
        mainMenus.add(new Menu("Order","장바구니를 확인 후 주문합니다"));
        mainMenus.add(new Menu("Cancle","진행중인 주문을 취소합니다"));

    }


}
