package creational.singleton;


public class SingletonMain {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("start 1");
            Counter counter = Counter.getInstance();
            System.out.println(counter);
            counter.increment();
            System.out.println("Counter increment  :: " + counter.getValue());
            counter.increment();
            System.out.println("Counter increment  :: " + counter.getValue());
            counter.increment();
            System.out.println("Counter increment  :: " + counter.getValue());
            counter.increment();
            System.out.println("Counter increment  :: " + counter.getValue());
            counter.increment();
            System.out.println("Counter increment  :: " + counter.getValue());
            counter.increment();
            System.out.println("Counter increment  :: " + counter.getValue());
            counter.increment();
            System.out.println("Counter increment  :: " + counter.getValue());

        });

        Thread thread1 = new Thread(() -> {
            System.out.println("start 2");
            Counter counter1 = Counter.getInstance();
            System.out.println(counter1);

            counter1.increment();
            System.out.println("Counter1 increment :: " + counter1.getValue());

        });
        Thread thread2 = new Thread(() -> {
            System.out.println("start 3");
            Counter counter1 = Counter.getInstance();
            System.out.println(counter1);

            counter1.increment();
            System.out.println("Counter1 increment :: " + counter1.getValue());

        });
        System.out.println("start");
        thread.start();
        thread1.start();
        thread2.start();


    }
}


