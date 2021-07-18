package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle_1 = new Triangle(-3, -4, -5, "green");

    @Test
    public void triangle_Test_1() {
        assertEquals(triangle_1.getLengthSideA(), 3);
    }

    @Test
    public void triangle_Test_2() {
        assertEquals(triangle_1.getLengthSideB(), 4);
    }

    @Test
    public void triangle_Test_3() {
        assertEquals(triangle_1.getLengthSideC(), 5);
    }

    @Test
    public void triangle_Test_4() {
        assertEquals(triangle_1.getArea(), 6);
    }

}