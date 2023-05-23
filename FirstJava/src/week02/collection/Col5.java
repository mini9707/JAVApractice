package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        // set(집합) -> 순서 없고, 중복 없음
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        // set -> 그냥 쓸 수 있으나 Hashset, Treeset 등으로 응용해서 같이 사용 가ㅏ능
        // set은 생성자가 없는 껍데기라서 바로 생성할 수 없음
        // 생성자가 존재하는 HashSet을 이용해서 set 실습

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(9);
        intSet.add(5);
        intSet.add(1);
        intSet.add(15);

        for (Integer value: intSet){
            System.out.println(value);
        }

        //contains
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));
    }
}
