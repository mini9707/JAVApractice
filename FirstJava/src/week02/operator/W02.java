package week02.operator;

public class W02 {
    public static void main(String[] args) {
        //사칙연산 : +, -, /, *, %
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5/2);
        System.out.println(2/4);
        System.out.println(4%2);
        System.out.println(5%2);
        System.out.println("================");

        //우선순위 연산
        System.out.println(2+2*2); //우선순위 * > +
        System.out.println((2+2)*2);

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        //덧셈
        c = a + b;
        System.out.println(c);
        //사칙연산
        c = a - b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);
    }
}