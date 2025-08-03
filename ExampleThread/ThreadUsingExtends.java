class ThreadUsingExtends extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // 0.5 second
            } catch (InterruptedException e) {
                System.out.println("Child interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        ThreadUsingExtends t1 = new ThreadUsingExtends(); // Thread object
        t1.start(); // run() method will execute in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500); // 0.5 second
            } catch (InterruptedException e) {
                System.out.println("Main interrupted.");
            }
        }
    }
}
