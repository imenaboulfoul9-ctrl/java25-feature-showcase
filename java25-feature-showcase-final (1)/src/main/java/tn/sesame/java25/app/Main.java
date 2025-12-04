package tn.sesame.java25.app;

import tn.sesame.java25.features.records.PersonRecordDemo;
import tn.sesame.java25.features.sealed.ShapeDemo;
import tn.sesame.java25.features.patternmatching.PatternMatchingDemo;
import tn.sesame.java25.features.Switch.SwitchExpressionDemo;
import tn.sesame.java25.features.textblocks.TextBlockDemo;
import tn.sesame.java25.concurrency.threads.ThreadDemo;
import tn.sesame.java25.concurrency.virtualthreads.VirtualThreadDemo;
import tn.sesame.java25.concurrency.executors.ExecutorDemo;
import tn.sesame.java25.concurrency.async.CompletableFutureDemo;
import tn.sesame.java25.concurrency.lockfree.AtomicDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Java 25 Feature Showcase ===");
        System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");

        PersonRecordDemo.runDemo();
        ShapeDemo.runDemo();
        PatternMatchingDemo.runDemo();
        SwitchExpressionDemo.runDemo();
        TextBlockDemo.runDemo();

        ThreadDemo.runDemo();
        VirtualThreadDemo.runDemo();
        ExecutorDemo.runDemo();
        CompletableFutureDemo.runDemo();
        AtomicDemo.runDemo();

        System.out.println("=== End of Demo ===");
    }
}
