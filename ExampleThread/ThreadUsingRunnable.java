class ThreadUsingRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ThreadUsingRunnable obj = new ThreadUsingRunnable();
        Thread t = new Thread(obj);
        t.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Main interrupted");
            }
        }
    }
}
