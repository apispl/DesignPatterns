package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MultiThreadSingleton {
    public static void main(String[] args) throws InterruptedException {

        final Singleton[] firstInstance = {Singleton.getInstance()};
        final Singleton[] secondInstance = {Singleton.getInstance()};

        Runnable task1 = () -> {
            firstInstance[0] = Singleton.getInstance();
        };
        Runnable task2 = () -> {
            secondInstance[0] = Singleton.getInstance();
        };

        int testSuccess = 0;
        int testFail = 0;
        for (int i = 0; i < 1000; i++) {
            Singleton.instance = null;
            ExecutorService service = Executors.newFixedThreadPool(2);
            service.submit(task1);
            service.submit(task2);
            service.shutdown();
            service.awaitTermination(1, TimeUnit.SECONDS);

            if (firstInstance[0] != null && secondInstance[0] != null && firstInstance[0].equals(secondInstance[0])) {
                testSuccess++;
            } else {
                testFail++;
            }
        }

        System.out.println(String.format("testSuccess: %d, testFail: %d", testSuccess, testFail));

    }

}
