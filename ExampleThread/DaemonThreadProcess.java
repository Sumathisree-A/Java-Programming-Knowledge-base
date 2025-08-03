// Garbage collector is an exmplae for Daemon thread which runs in background
public class DaemonThreadProcess {
    public static void main(String[] args) {
        var d = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running in background...");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Daemon thread interrupted.");
                }
            }
        });

        d.setDaemon(true);
        d.start();

        // Main thread sleeps for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished. JVM will exit if only daemon threads remain.");
    }
}
