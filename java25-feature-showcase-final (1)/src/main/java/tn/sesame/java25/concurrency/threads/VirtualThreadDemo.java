package tn.sesame.java25.concurrency.virtualthreads;
public class VirtualThreadDemo {
    public static void runDemo() {
        System.out.println("-- Virtual Thread Demo --");
        Thread vt = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from virtual thread imen");
            System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
        });
        try { vt.join(); } catch (InterruptedException e) {}
    }
}