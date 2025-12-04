package tn.sesame.java25.features.textblocks;
public class TextBlockDemo {
    public static void runDemo() {
        System.out.println("-- Text Blocks Demo --");
        String text = """
            Hello,
            This is a text block demo
            in Java 25.
        """;
        System.out.println(text);
        System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
    }
}