package tn.sesame.java25.features.patternmatching;
public class PatternMatchingDemo {
    public static void runDemo() {
        System.out.println("-- Pattern Matching Demo --");
        Object obj = "imen";
        if (obj instanceof String s) {
            System.out.println("Matched string: " + s);
        }
        System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
    }
}