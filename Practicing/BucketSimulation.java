package Practicing;

public class BucketSimulation {

    private static final int BUCKET_CAPACITY = 100;
    private static final int MUG_CAPACITY = 3;
    private static final int DRAW_AMOUNT = 10;
    private static final long FILLER_TIME_LIMIT = 120_000; // 2 minutes in milliseconds
    private static final long DRAW_DELAY = 3_000; // 3 seconds
    private static final long OVERFLOW_PAUSE = 2_000; // 2 seconds

    private volatile int bucketLevel = 0;  // using volatile to ensure visibility across threads
    private int timesEmptied = 0;
    private final Object lock = new Object();  // lock object for synchronization

    public static void main(String[] args) {
        new BucketSimulation().startSimulation();
    }

    private void startSimulation() {
        Thread fillerThread1 = new Thread(this::fillBucket);
        Thread fillerThread2 = new Thread(this::fillBucket);
        Thread fillerThread3 = new Thread(this::fillBucket);
        Thread drawerThread = new Thread(this::drawFromBucket);

        fillerThread1.start();
        fillerThread2.start();
        fillerThread3.start();
        drawerThread.start();

        try {
            Thread.sleep(FILLER_TIME_LIMIT);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        try {
            fillerThread1.interrupt();
            fillerThread2.interrupt();
            fillerThread3.interrupt();
            drawerThread.interrupt();
            fillerThread1.join();
            fillerThread2.join();
            fillerThread3.join();
            drawerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("The washer went to the bucket " + timesEmptied + " times to empty it.");
    }

    private void fillBucket() {
        try {
            while (!Thread.interrupted()) {
                synchronized (lock) {
                    if (bucketLevel + MUG_CAPACITY > BUCKET_CAPACITY) {
                        System.out.println("Bucket is full. Fillers are waiting.");
                        lock.wait(OVERFLOW_PAUSE);
                        lock.notifyAll();// wait until some space is available
                    } else {
                        bucketLevel += MUG_CAPACITY;
                        System.out.println("Filled 3 liters, current bucket level: " + bucketLevel + "L");
                        lock.notifyAll();  // notify the drawer thread that it can draw if needed
                    }
                }
                Thread.sleep(500); // simulate time to refill the mug
            }
        } catch (InterruptedException e) {
            System.out.println("Filler thread is stopping.");
        }
    }

    private void drawFromBucket() {
        try {
            Thread.sleep(DRAW_DELAY); // initial delay
            while (!Thread.interrupted()) {
                synchronized (lock) {
                    while (bucketLevel < DRAW_AMOUNT) {
                        lock.wait(); // wait for enough water to draw
                    }
                    bucketLevel -= DRAW_AMOUNT;
                    timesEmptied++;
                    System.out.println("Drew 10 liters, current bucket level: " + bucketLevel + "L");
                    lock.notifyAll();  // notify the filler threads they can fill if stopped
                }
                Thread.sleep(1000); // simulate time to use the water drawn
            }
        } catch (InterruptedException e) {
            System.out.println("Drawer thread is stopping.");
        }
    }
}
