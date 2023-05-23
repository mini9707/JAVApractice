package week02.array;

import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        //얕은 복사
//        int[] a = {1,2,3,4,5};
//        int[] b = a;
//        b[0] = 8;
//        System.out.println(a[0]);

        //깊은 복사
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = new int[a.length];
//
//        for (int i=0; i<a.length; i++) {
//            b[i] = a[i];
//        }
//        b[0] = 8;
//        System.out.println(a[0]);

        //깊은 복사 메서드!
        //clone() 메서드 -> 2차원 이상 배열에서는 얕은 복사로 동작
        //copyOf() 메서드 -> 깊은복사
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length);

        a[3] = 0;
        System.out.println(a[3]);
        System.out.println(b[3]);

    }
}
