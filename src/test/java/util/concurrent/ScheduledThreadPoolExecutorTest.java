package util.concurrent;

import org.junit.Test;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorTest {

    @Test
    public void init() {

    }

    @Test
    public void schedule() throws InterruptedException {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);

        scheduledThreadPoolExecutor.schedule(() -> System.out.println(Thread.currentThread().getName()), 500, TimeUnit.MICROSECONDS);

        TimeUnit.SECONDS.sleep(1L);

    }
}
