package week05.Thread;

public class Main {
    public static void main(String[] args) {
        // 쓰레드를 구현하는 방법 3가지
        // 1. Thread
//        TestThread thread = new TestThread();
//        thread.start();

        // 2. Runnable
//        Runnable run = new TestRunnable();
//        Thread thread = new Thread(run);
//        thread.start();

        // 3. 람다식
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}
