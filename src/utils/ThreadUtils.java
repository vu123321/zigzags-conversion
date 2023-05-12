package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {

    private ThreadUtils() {

    }

    public static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
