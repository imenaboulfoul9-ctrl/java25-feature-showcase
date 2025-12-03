
package com.example.java25;

// Pattern matching + examples using the sealed hierarchy
public class SealedAndPattern {
    public static String describe(Object o) {
        return switch (o) {
            case Integer i -> "Integer: " + i;
            case String s -> "String of length " + s.length();
            case Circle c -> "Circle r=" + c.radius();
            case Rectangle r -> "Rectangle area=" + r.area();
            default -> "Unknown";
        };
    }

    public static void run() {
        System.out.println("\n-- Sealed classes & Pattern Matching --");
        Shape c = new Circle(2.5);
        Shape r = new Rectangle(3,4);
        System.out.println(describe(c));
        System.out.println(describe(r));
        System.out.println(describe("hello"));
        System.out.println(describe(42));
    }
}
