package week02.operator;

public class W01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end-start)/1000 + "초");
    }
}
