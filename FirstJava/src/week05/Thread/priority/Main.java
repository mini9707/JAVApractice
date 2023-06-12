package week05.Thread.priority;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.setPriority(8);
        int threadPriority = thread1.getPriority();
        //thread1.getPriority()를 통해 thread1 에 우선순위를 가져올 수 있음
        System.out.println("threadPriority = " + threadPriority);

        Thread thread2 = new Thread(task2);
        thread2.setPriority(2);

        thread1.start();
        thread2.start();
    }
}