package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void testAdd() {

        assertEquals(5,calculator.add(3,2));
    }

    @Test
    void testSubtract() {

        assertEquals(7,calculator.subtract(10,3));
    }

    @Test
    void testMultiply() {

        assertEquals(10,calculator.multiply(5,2));
    }

    @Test
    void testDivide() {

        assertEquals(4,calculator.divide(8,2));
        assertEquals(10,calculator.divide(100,10));
    }
}