package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleZeroRadiusTest {
    @Test
    void circleWithZeroRadiusHasZeroArea() {
        Shape circle = new Circle(0);
        assertEquals(0, circle.getArea(), 0.001);
    }
}
