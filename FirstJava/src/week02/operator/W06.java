package week02.operator;

public class W06 {
    public static void main(String[] args) {
        //기타연산자 : 형변환 연산자 / 삼항연산자 / instance of 연산자
        //형변환 연산자
        int intNumber = 93 + (int)98.8;
        System.out.println(intNumber);

        double doubleNumber = (double)93 + 98.8;
        System.out.println(doubleNumber);
        System.out.println("======================");

        //삼항연산자 (조건 ? 참 : 거짓)
        int x = 1;
        int y = 9;
        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x!=y) ? "정답" : "오답";
        System.out.println(s);

        int max = (x > y) ? x : y;
        System.out.println("최대값 : " + max);

        int min = (x < y) ? x : y;
        System.out.println("최소값 : " + min);

        //instance of
        //피 연산자가 조건에 명시된 클래스의 객체인지 비교하여 맞으면 true / 틀리면 false
    }
}
