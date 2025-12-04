package tn.sesame.java25.concurrency.lockfree;
import java.util.concurrent.atomic.AtomicInteger;
public class AtomicDemo {
    public static void runDemo() {
        System.out.println("-- Atomic Demo --");
        AtomicInteger ai = new AtomicInteger(0);
        ai.incrementAndGet();
        System.out.println("Atomic value: " + ai);
        System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
    }
}