package com.vismedia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    //Add function tests
    @Test
    void addReturnsCorrectSum() {
        assertEquals(12, App.add(5, 7));
    }

    @Test
    void addHandlesZero() {
        assertEquals(7, App.add(0, 7));
        assertEquals(7, App.add(7, 0));
    }

    @Test
    void addHandlesNegativeValues() {
        assertEquals(-3, App.add(-1, -2));
        assertEquals(-1, App.add(2, -3));
    }

    @Test
    void addIsCommutative() {
        assertEquals(App.add(10, 3), App.add(3, 10));
    }

    @Test
    void addEdgeCaseIntegerLimit() {
        // Overflow case
        int result = App.add(Integer.MAX_VALUE, 1);
        // This demonstrates wraparound behavior
        assertTrue(result < 0);
    }

    @Test
    void addHandlesZeroBothSides() {
        assertEquals(0, App.add(0, 0));
    }

    //isPositive tests
    @Test
    void isPositiveWorks() {
        assertTrue(App.isPositive(5));
        assertFalse(App.isPositive(-10));
    }

    //Multiply tests

    @Test
    void multiplyWorks() {
        assertEquals(15, App.multiply(3, 5));
    }

    @Test
    void multiplyNegativeNumbers() {
        assertEquals(-15, App.multiply(3, -5));
        assertEquals(15, App.multiply(-3, -5));
    }

    @Test
    void multiplyByZero() {
        assertEquals(0, App.multiply(0, 99));
        assertEquals(0, App.multiply(99, 0));
    }

    @Test
    void multiplyOverflow() {
        int result = App.multiply(Integer.MAX_VALUE, 2);
        assertTrue(result < 0);  // Confirm wraparound
    }
    
}
