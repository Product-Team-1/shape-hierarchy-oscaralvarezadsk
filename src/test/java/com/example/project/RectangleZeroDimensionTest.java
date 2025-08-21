package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleZeroDimensionTest {
    @Test
    void rectangleWithZeroWidthOrHeightHasZeroArea() {
        Shape rectangle1 = new Rectangle(0, 5);
        Shape rectangle2 = new Rectangle(5, 0);
        assertEquals(0, rectangle1.getArea(), 0.001);
        assertEquals(0, rectangle2.getArea(), 0.001);
    }
}
