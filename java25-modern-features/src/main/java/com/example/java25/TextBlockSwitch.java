
package com.example.java25;

public class TextBlockSwitch {
    public static void run() {
        System.out.println("\n-- Text Blocks & Switch Expressions --");
        String json = """
        {
          "app": "java25-demo",
          "features": ["records","sealed","pattern-matching","text-blocks"]
        }
        """;
        System.out.println("JSON text block:\n" + json);

        Object[] inputs = {1, "abc", new Circle(1.2)};
        for (Object o : inputs) {
            String res = switch (o) {
                case Integer i -> "int -> " + i;
                case String s -> "str -> " + s.toUpperCase();
                case Circle c -> "circle r=" + c.radius();
                default -> "other";
            };
            System.out.println("switch result: " + res);
        }
    }
}
