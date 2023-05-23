package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map : key -> value pair 중요
        // Key라는 값으로 unique하게 보장되어야 함
        // Map -> Hashmap, Treemap으로 응용

        Map<String, Integer> intMap = new HashMap<>();
        //key값 세팅
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 15);

        //key값 전체 출력
        for (Integer value : intMap.values()){
            System.out.println(value);
        }

        System.out.println(intMap.get("삼"));

    }
}
