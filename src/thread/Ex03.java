package thread;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("Thread main start");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" is running ...");
            }
        }, "Database-Thread");
        thread.start();

        System.out.println("Thread main end");
    }
}
