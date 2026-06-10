import java.util.concurrent.Semaphore;

class H2O {

    private Semaphore h = new Semaphore(2);
    private Semaphore o = new Semaphore(0);

    public void hydrogen(Runnable releaseHydrogen)
            throws InterruptedException {

        h.acquire();

        releaseHydrogen.run();

        if (h.availablePermits() == 0) {
            o.release();
        }
    }

    public void oxygen(Runnable releaseOxygen)
            throws InterruptedException {

        o.acquire();

        releaseOxygen.run();

        h.release(2);
    }
}

public class H2ODemo {

    public static void main(String[] args) {

        H2O h2o = new H2O();

        Runnable hydrogen = () -> System.out.print("H");
        Runnable oxygen = () -> System.out.print("O");

        Thread t1 = new Thread(() -> {
            try {
                h2o.hydrogen(hydrogen);
            } catch (Exception e) {
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                h2o.hydrogen(hydrogen);
            } catch (Exception e) {
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                h2o.oxygen(oxygen);
            } catch (Exception e) {
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}