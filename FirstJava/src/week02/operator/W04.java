package week02.operator;

public class W04 {
    //논리연산자
    public static void main(String[] args) {
        //&&(and), ||(or), !(not)
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        System.out.println("========================");
        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);

        System.out.println("========================");
        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag3);

        System.out.println("========================");
        System.out.println((5>3) && (3>1));
        System.out.println((5>3) && (3<1));

        System.out.println("========================");
        System.out.println((5>3) || (3>1)); //t||t ->t
        System.out.println((5>3) || (3<1)); //t||f ->t
        System.out.println((5<3) || (3<1)); //f||f ->f

        //논리부정연산자(!(not)
        System.out.println("========================");
        System.out.println(!flag1);
        System.out.println(!flag3);

    }
}
