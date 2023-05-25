package week03.hwCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(new AddOperation());
        System.out.println(cal.calculator(32,20));
    }
}
