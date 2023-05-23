package week02.operator;

public class W05 {
    //대입연산자
    public static void main(String[] args) {
        // =(기본대입연산자), +=, -=, *=, ...(복합대입연산자)
        int number = 10;
        number +=2; //== number=number+2
        System.out.println(number);

        number -=2;
        System.out.println(number);

        number *=2;
        System.out.println(number);

        number /=2;
        System.out.println(number);

        number %=2;
        System.out.println(number);

        number++;
        System.out.println(number);

        number++;
        System.out.println(number);
    }
}
