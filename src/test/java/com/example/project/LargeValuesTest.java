package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargeValuesTest {
    @Test
    void handlesLargeValues() {
        Shape rectangle = new Rectangle(1e6, 1e6);
        assertEquals(1e12, rectangle.getArea(), 1e6);
    }
}
