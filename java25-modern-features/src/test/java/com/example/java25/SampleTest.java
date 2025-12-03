
package com.example.java25;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    @Test
    void testPersonRecord() {
        Person p = new Person("Bob", 25);
        assertEquals("Bob", p.name());
    }
}
