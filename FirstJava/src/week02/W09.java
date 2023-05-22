package week02;

public class W09 {
    public static void main(String[] args) {
        //조건문 if, switch
        boolean flag = true;

        if (1 != 1){
            System.out.println("값이 TRUE 입니다");
        } else {
            System.out.println("값이 FALSE 입니다");
        }

        if (1 != 1){
            System.out.println("if");
        } else if (3 > 1){
            System.out.println("else-if");
        } else {
            System.out.println("else");
        }

        int number = 2;

        if (number == 1){
            System.out.println("값은 1");
        } else if (number == 2){
            System.out.println("값은 2");
        } else {
            System.out.println("값은 3");
        }
    }
}
