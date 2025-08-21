package com.example.project;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class PolymorphismTest {
    @Test
    void polymorphismWorks() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1));
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Triangle(3, 4));

        double total = 0;
        for (Shape s : shapes) {
            total += s.getArea();
        }
        assertTrue(total > 0);
    }
}
