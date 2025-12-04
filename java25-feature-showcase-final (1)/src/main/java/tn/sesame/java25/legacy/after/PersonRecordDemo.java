package tn.sesame.java25.features.records;
public class PersonRecordDemo {
    public record PersonRecord(String name, int age) {}
    public static void runDemo() {
        System.out.println("-- Records Demo --");
        PersonRecord p = new PersonRecord("imen", 25);
        System.out.println(p.name() + ", " + p.age());
        System.out.println("Ici, “imen” est accessible dans tous les threads lancés dans ce bloc.");
    }
}