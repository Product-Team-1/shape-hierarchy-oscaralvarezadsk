package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaTest {
    @Test
    void rectangleAreaCorrect() {
        Shape rectangle = new Rectangle(10, 5);
        assertEquals(50, rectangle.getArea(), 0.001);
    }
}
