package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {

    Ellipse ellipse_1  = new Ellipse(-8.0, -4.0, "orange");

    @Test
    public void ellipse_Test_1() {
        assertEquals(ellipse_1.getLengthLongAxis(), 8);
    }

    @Test
    public void ellipse_Test_2() {
        assertEquals(ellipse_1.getLengthShortAxis(), 4);
    }

    @Test
    public void ellipse_Test_3() {
        assertEquals(ellipse_1.getArea(), 3.14159 * 8 * 4);
    }
}