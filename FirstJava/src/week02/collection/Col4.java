package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        //큐(Queue) : First In First Out
        //add, peek(조회), poll(꺼내는것)
        // 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<Integer>();

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());


    }
}
