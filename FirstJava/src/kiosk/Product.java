package kiosk;

import java.util.ArrayList;

public class Product extends Menu {
    static ArrayList<String> burgerList = new ArrayList<>();
    static ArrayList<Double> burgerPrice = new ArrayList<>();
    static ArrayList<String> burgerDesc = new ArrayList<>();
    static ArrayList<String> fcList = new ArrayList<>();
    static ArrayList<Double> fcPrice = new ArrayList<>();
    static ArrayList<String> fcDesc = new ArrayList<>();
    static ArrayList<String> beerList = new ArrayList<>();
    static ArrayList<Double> beerPrice = new ArrayList<>();
    static ArrayList<String> beerDesc = new ArrayList<>();
    static ArrayList<String> drinkList = new ArrayList<>();
    static ArrayList<Double> drinkPrice = new ArrayList<>();
    static ArrayList<String> drinkDesc = new ArrayList<>();


    double price;
    int count=0;

    Order order = new Order();

    public void Product(int num) {
        if (num == 1) {             //burger 선택시
            System.out.println("[" + super.menuList.get(0) + " Menu]");
            for (int i = 0; i < burgerList.size(); i++) {
                System.out.println((i + 1) + "." + burgerList.get(i) + "|" + " W " + burgerPrice.get(i) + " | " + burgerDesc.get(i));
            }
            Integer productNum = Integer.parseInt(super.s.nextLine());
            for (int i = 1; i <= 5; i++) {
                if (productNum == i) {
                    System.out.println(burgerList.get(i - 1) + " | " + burgerPrice.get(i - 1) + " | " + burgerDesc.get(i - 1));
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인 2. 취소");
                    Integer checkNum = Integer.parseInt(super.s.nextLine());
                    if (checkNum == 1) {
                        order.setProduct(burgerList.get(i - 1), burgerPrice.get(i - 1), burgerDesc.get(i - 1));
                    }
                }
            }
        } else if (num == 2) {         //frozen custard 선택시
            System.out.println("[" + super.menuList.get(1) + " Menu]");
            for (int i = 0; i < fcList.size(); i++) {
                System.out.println((i + 1) + "." + fcList.get(i) + " | " + "W " + fcPrice.get(i) + " | " + fcDesc.get(i));
            }
            Integer productNum = Integer.parseInt(super.s.nextLine());
            for (int i = 1; i <= 3; i++) {
                if (productNum == i) {
                    System.out.println(fcList.get(i - 1) + " | " + fcPrice.get(i - 1) + " | " + fcDesc.get(i - 1));
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인 2. 취소");
                    Integer checkNum = Integer.parseInt(super.s.nextLine());
                    if (checkNum == 1) {
                        order.setProduct(fcList.get(i - 1), fcPrice.get(i - 1), fcDesc.get(i - 1));
                    }
                }
            }
        }else if (num == 3) {         //Drink선택시
            System.out.println("[" + super.menuList.get(2) + " Menu]");
            for (int i = 0; i <drinkList.size(); i++) {
                System.out.println((i + 1) + "." + drinkList.get(i) + " | " + " W " + drinkPrice.get(i) + " | " + drinkDesc.get(i));
            }
            Integer productNum = Integer.parseInt(super.s.nextLine());
            for (int i = 1; i <= 3; i++) {
                if (productNum == i) {
                    System.out.println(drinkList.get(i - 1) + " | " + drinkPrice.get(i - 1) + " | " + drinkDesc.get(i - 1));
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인 2. 취소");
                    Integer checkNum = Integer.parseInt(super.s.nextLine());
                    if (checkNum == 1) {
                        order.setProduct(drinkList.get(i - 1), drinkPrice.get(i - 1), drinkDesc.get(i - 1));
                    }
                }
            }
        } else if (num == 4) {         //Beer선택시
            System.out.println("[" + super.menuList.get(3) + " Menu]");
            for (int i = 0; i <beerList.size(); i++) {
                System.out.println((i + 1) + "." + beerList.get(i) + "|" + "W" + beerPrice.get(i) + "|" + beerDesc.get(i));
            }
            Integer productNum = Integer.parseInt(super.s.nextLine());
            for (int i = 1; i <= 3; i++) {
                if (productNum == i) {
                    System.out.println(beerList.get(i - 1) + "|" + beerPrice.get(i - 1) + "|" + beerDesc.get(i - 1));
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인 2. 취소");
                    Integer checkNum = Integer.parseInt(super.s.nextLine());
                    if (checkNum == 1) {
                        order.setProduct(beerList.get(i - 1), beerPrice.get(i - 1), beerDesc.get(i - 1));
                    }
                }
            }
        } else if(num==5){
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println("");
            System.out.println("[ ORDERS ]");
            for (int j=0; j<order.orderName.size();j++) {
                System.out.println(order.orderName.get(j) + "| W " + order.orderPrice.get(j) + " | " + order.orderDesc.get(j));
            }
            System.out.println("");
            System.out.println("[ TOTAL ]");
            for(int k=0; k<order.orderPrice.size(); k++){
                price += order.orderPrice.get(k);
            }
            System.out.println("W "+price);
            System.out.println("");
            System.out.println("1. 주문  2. 메뉴판");
            Integer productNum = Integer.parseInt(super.s.nextLine());
            if(productNum==1){
                order.clearProduct();
                price=0;
                System.out.println("주문이 완료 되었습니다");
                count++;
                System.out.println("");
                System.out.println("대기번호는 ["+count+"]번 입니다.");
                System.out.println("3초후 메뉴판으로 돌아갑니다.");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if(productNum==2){
                price=0;
            }
        }else if(num==6){
            System.out.println("진행하던 주문을 취소 하시겠습니까?");
            System.out.println("1. 확인  2. 취소");
            Integer productNum = Integer.parseInt(super.s.nextLine());
            if(productNum==1){
                order.clearProduct();
                price=0;
                System.out.println("진행하던 주문이 취소되었습니다.");
            }
        }
    }
    static{
        burgerList.add("불고기버거");
        burgerList.add("새우버거");
        burgerList.add("한우불고기버거");
        burgerList.add("빅불");
        burgerList.add("모짜렐라인더버거");
        burgerPrice.add(4.7);
        burgerPrice.add(4.7);
        burgerPrice.add(8.4);
        burgerPrice.add(7.1);
        burgerPrice.add(7.4);
        burgerDesc.add("두툼한 쇠고기 패티와 한국적인 맛의 소스가 잘 조화된 롯데리아 대표 버거");
        burgerDesc.add("새우살을 가득 넣어 더 맛있어진 오리지널 새우버거");
        burgerDesc.add("브리오쉬번에 국내산 한우를 사용한 패티, 신선한 야채, 특제소스로 완성한 프리미엄 버거");
        burgerDesc.add("불고기 패티 2장으로 더 진하고 더 커진 빅 불고기버거");
        burgerDesc.add("자연산 모짜렐라 치즈와 고소한 베이컨이 만나 풍부한 맛의 버거");
        fcList.add("순살치킨");
        fcList.add("하프치킨");
        fcList.add("치킨휠레");
        fcPrice.add(16.8);
        fcPrice.add(10.5);
        fcPrice.add(3.1);
        fcDesc.add("바삭한 외피와 육즙 가득한 닭다리살 순살치킨 22조각");
        fcDesc.add("신선한 치킨을 사용하여 부드러움과 담백함이 살아있는 후라이드 치킨");
        fcDesc.add("닭안심살로 만든 담백하고 매콤한 순살치킨 2조각");
        drinkList.add("콜라");
        drinkList.add("레몬에이드");
        drinkList.add("미숫가루 라떼");
        drinkPrice.add(3.0);
        drinkPrice.add(2.7);
        drinkPrice.add(2.9);
        drinkDesc.add("펩시콜라");
        drinkDesc.add("상큼한 레몬 맛과 톡 쏘는 탄산의 청량함이 느껴지는 시원한 아이스 드링크");
        drinkDesc.add("국산 미숫가루를 사용한 달달한 추억의 라떼");
        beerList.add("치즈스틱");
        beerList.add("감자튀김");
        beerList.add("토네이도 초코");
        beerPrice.add(2.4);
        beerPrice.add(1.8);
        beerPrice.add(2.8);
        beerDesc.add("통모짜렐라치즈에 튀김옷을 입혀 만든 바삭하고 고소한 롯데리아 대표 디저트");
        beerDesc.add("바로 튀겨낸 바삭바삭한 후렌치 포테이토");
        beerDesc.add("부드러운 아이스크림에 달콤한 초코쿠키를 넣어 만든 아이스크림");
    }

}
