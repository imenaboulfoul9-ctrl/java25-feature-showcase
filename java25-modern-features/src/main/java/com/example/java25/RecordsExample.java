
package com.example.java25;

// Simple record example (immutable data carrier)
record Person(String name, int age) {
    public Person {
        if (age < 0) throw new IllegalArgumentException("age must be >= 0");
    }

    public String greeting() {
        return "Hello, I'm " + name + " and I'm " + age + " years old.";
    }

    public static void run() {
        System.out.println("\n-- Records Example --");
        Person p = new Person("Imen", 23);
        System.out.println(p.greeting());
    }
}
