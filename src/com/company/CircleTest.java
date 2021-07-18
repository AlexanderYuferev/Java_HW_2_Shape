package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle_1   = new Circle(-5.0, "blue");

    @Test
    public void circle_Test_1() {
        assertEquals(circle_1.getRadius(), 5);
    }

    @Test
    public void circle_Test_2() {
        assertEquals(circle_1.getArea(), 2 * 3.14159 * 5 * 5);
    }
}