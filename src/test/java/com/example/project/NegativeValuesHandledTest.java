package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NegativeValuesHandledTest {
    @Test
    void negativeDimensionsTreatedAsZero() {
        Shape circle = new Circle(-3);
        Shape rectangle = new Rectangle(-4, 5);
        Shape triangle = new Triangle(6, -2);

        assertEquals(0, circle.getArea(), 0.001);
        assertEquals(0, rectangle.getArea(), 0.001);
        assertEquals(0, triangle.getArea(), 0.001);
    }
}
