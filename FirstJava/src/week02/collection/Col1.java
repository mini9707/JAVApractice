package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        //List -> 길이를 몰라도 만들 수 있음 -> 동적배열 -> 크기가 가변적으로 늘어난다.
        //순서가 있는 데이터의 집합 -> Array(최초 길이를 알아야함) -> 정적배열
        ArrayList<Integer> intList = new ArrayList<Integer>(); //선언 + 생성
        intList.add(99);
        intList.add(15);
        intList.add(42);
        intList.add(1);
        intList.add(57);

//        System.out.println(intList.get(1));

        //2번째 있는 값(42)을 바꿔보자
        intList.set(2,0);
//        System.out.println(intList.get(2));

        //remove -> 삭제되고 빈자리를 앞으로 한칸씩 채운다
        intList.remove(0);
//        System.out.println(intList.get(0));

        //리스트 비우기
        intList.clear();
        System.out.println(intList.toString());
    }
}
