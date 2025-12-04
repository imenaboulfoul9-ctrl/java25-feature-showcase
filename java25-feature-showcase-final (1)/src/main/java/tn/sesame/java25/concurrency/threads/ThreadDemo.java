package tn.sesame.java25.concurrency.threads;
public class ThreadDemo {
    public static void runDemo() {
        System.out.println("-- Thread Demo --");
        Thread t = new Thread(() -> {
            System.out.println("Hello from thread imen");
            System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
        });
        t.start();
        try { t.join(); } catch (InterruptedException e) {}
    }
}