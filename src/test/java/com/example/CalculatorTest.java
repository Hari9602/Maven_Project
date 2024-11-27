package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5, Calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, Calculator.add(-2, 1), "-2 + 1 should equal -1");
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, Calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-3, Calculator.subtract(-2, 1), "-2 - 1 should equal -3");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, Calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-6, Calculator.multiply(-2, 3), "-2 * 3 should equal -6");
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.divide(6, 3), "6 / 3 should equal 2");
        assertEquals(-2, Calculator.divide(-6, 3), "-6 / 3 should equal -2");

        // Test division by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(1, 0);
        });

        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}