package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleAreaTest {
    @Test
    void circleAreaCorrect() {
        Shape circle = new Circle(3);
        assertEquals(Math.PI * 9, circle.getArea(), 0.001);
    }
}
