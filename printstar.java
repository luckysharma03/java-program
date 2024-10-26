package skl_oop_java_B3;

/*
 *  Aim :Write a program to print /*/*/*/*/* using two child thread.
* Name : Sharma lucky
* UIN : 231P061
* Div : A.
*/

class PrintSlash extends Thread {
    private final Object lock;
    private final int count;

    public PrintSlash(Object lock, int count) {
        this.lock = lock;
        this.count = count;
System.out.println("lucky sharma 42 231P061");
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            synchronized (lock) {
                System.out.print("/");
                lock.notify();  // Wake up the other thread
                try {
                    lock.wait();  // Pause and wait for the other thread
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class PrintStar extends Thread {
    private final Object lock;
    private final int count;

    public PrintStar(Object lock, int count) {
        this.lock = lock;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            synchronized (lock) {
                System.out.print("*");
                lock.notify();  // Wake up the other thread
                try {
                    lock.wait();  // Pause and wait for the other thread
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class SlashStarPrinter {
    public static void main(String[] args) {
        Object lock = new Object();
        int patternLength = 5;  // Length of the pattern /*/*/*/*/*

        // Create two threads
        Thread slashThread = new PrintSlash(lock, patternLength);
        Thread starThread = new PrintStar(lock, patternLength);

        // Start the star thread first
        starThread.start();
        slashThread.start();

        // Ensure both threads complete
        try {
            slashThread.join();
            starThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nPattern printed successfully.");
    }

System.out.print("lucky sharma / 42 / 231P061 ");
}
