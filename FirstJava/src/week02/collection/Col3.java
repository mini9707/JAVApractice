package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        //stack -> 수직으로 값을 쌓고, 뺀다 -> First In Last Out
        //push, peek, pop
        //최근 저장된 데이터를 나열하고 십거나, 데이터의 중복 처리를 막고 싶을 때 사용

        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //isEmpty() -> 비었으면 true 반환 -> !intStack.isEmpty()는 비어있지 않으면 반복문 계속 수행
        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
            //첫번째 10이 출력되고 pop(삭제)되고, 두번째 15가 출력되고 pop이 된다...
        }

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        System.out.println(intStack.peek());
        System.out.println(intStack.size());

    }
}
