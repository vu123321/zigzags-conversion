package thread;

import java.util.concurrent.TimeUnit;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" is running...");
        System.out.println("Thread main start");

        Thread t0 = new Thread("t0"){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" is running...");
            }
        };
        t0.start(); // JVM automatically call run method

        sleep(2);
        System.out.println("Thread main end");
    }

    private static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
// phỏng vấn tại sao không gọi trực tiếp hàm Run , mà lại phải @Override hàm run