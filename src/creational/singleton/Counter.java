package creational.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static volatile Counter instance;
    private final AtomicInteger value = new AtomicInteger(0);

    private Counter() {
    }

    public static Counter getInstance() {
        if (instance == null) {
            synchronized (Counter.class) {
                if (instance == null) {
                    instance = new Counter();
                }
            }
        }
        return instance;
    }

    public void increment() {
        value.addAndGet(1);
    }

    public int getValue() {
        return value.get();
    }
}
