package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square_1   = new Square(-10, "black");

    @Test
    public void square_Test_1() {
        assertEquals(square_1.getLengthSide(), 10);
    }

    @Test
    public void square_Test_2() {
        assertEquals(square_1.getArea(), 100);
    }
}