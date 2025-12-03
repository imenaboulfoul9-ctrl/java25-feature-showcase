package com.example.java25;

import java.lang.ScopedValue;
import java.util.concurrent.StructuredTaskScope;

public class PreviewFeaturesDemo {

    static final ScopedValue<String> USER = ScopedValue.newInstance();

    public static void run() throws Exception {

        System.out.println("\n-- Preview Features (ScopedValue, Structured Concurrency) --");

        // Updated ScopedValue API
        try {
            ScopedValue.where(USER, "imen").run(() -> {
                System.out.println("Scoped user: " + USER.get());
            });
        } catch (Throwable t) {
            System.out.println("ScopedValue not available: " + t);
        }

        // Updated Structured Concurrency API
        try (var scope = StructuredTaskScope.<String>open()) {

            var future1 = scope.fork(() -> {
                Thread.sleep(100);
                return "result1";
            });

            var future2 = scope.fork(() -> {
                Thread.sleep(100);
                return "result2";
            });

            scope.join();          // wait for both subtasks
            scope.notifyAll(); // throw if any subtask failed

            System.out.println("Structured results: "
                    + future1.get() + ", "
                    + future2.get());

        } catch (Throwable t) {
            System.out.println("Structured concurrency not supported: " + t);
        }
    }
}
