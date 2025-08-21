package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {
    @Test
    void triangleAreaCorrect() {
        Shape triangle = new Triangle(6, 4);
        assertEquals(12, triangle.getArea(), 0.001);
    }
}
