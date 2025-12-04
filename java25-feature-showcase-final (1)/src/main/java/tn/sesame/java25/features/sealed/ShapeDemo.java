package tn.sesame.java25.features.sealed;
public class ShapeDemo {
    public sealed interface Shape permits Circle, Square {}
    public record Circle(double radius) implements Shape {}
    public record Square(double side) implements Shape {}
    public static void runDemo() {
        System.out.println("-- Sealed Classes Demo --");
        Shape s = new Circle(5);
        System.out.println(s);
        System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
    }
}