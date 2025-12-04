package tn.sesame.java25.concurrency.async;
import java.util.concurrent.*;
public class CompletableFutureDemo {
    public static void runDemo() {
        System.out.println("-- CompletableFuture Demo --");
        CompletableFuture.runAsync(() -> {
            System.out.println("Hello from async imen");
            System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
        }).join();
    }
}