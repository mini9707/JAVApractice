package week02.operator;

public class W08 {
    public static void main(String[] args) {
        //두 피연산자의 타입이 다른 경우 타입을 일치시킨다 (데이터 타입이 큰 타입으로 일치)
        //byte < short < int < long < float < double
        short x = 10;
        int y = 20;
        int z = x + y;

        long lx = 30L;
        long lz = z + lx;

        float fx = x;
        float fy = y;
        float fz = z;

        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);
        System.out.println("=================");

        //비트연산
        // 자리수 왼쪽으로 한칸 이동 -> 2의 배수 곱셈
        // 왼쪽으로 두칸 이동 ( x << 2) -> 2의 2승 곱셈
        // 자리수 오른쪽으로 이동 -> 2의 배수 나눗셈
        System.out.println(32 >> 3);



    }
}
