package tn.sesame.java25.concurrency.executors;
import java.util.concurrent.*;
public class ExecutorDemo {
    public static void runDemo() {
        System.out.println("-- Executor Demo --");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println("Hello from executor imen");
            System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
        });
        executor.shutdown();
        try { executor.awaitTermination(1, TimeUnit.SECONDS); } catch (InterruptedException e) {}
    }
}