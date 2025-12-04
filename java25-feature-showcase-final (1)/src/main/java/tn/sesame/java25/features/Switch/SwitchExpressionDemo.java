package tn.sesame.java25.features.Switch;
public class SwitchExpressionDemo {
    public static void runDemo() {
        System.out.println("-- Switch Expression Demo --");
        String day = "MONDAY";
        String type = switch(day) {
            case "MONDAY", "FRIDAY" -> "Start/End";
            default -> "Midweek";
        };
        System.out.println(type);
        System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
    }
}