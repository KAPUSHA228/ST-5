package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class SqrtTest {

    @Test
    void testConstructor() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(25.0, sqrt.arg);
    }

    @Test
    void testAverage() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(2.5, sqrt.average(2.0, 3.0), 0.0001);
    }

    @Test
    void testGoodTrue() {
        Sqrt sqrt = new Sqrt(16.0);
        assertTrue(sqrt.good(4.0, 16.0));
    }

    @Test
    void testGoodFalse() {
        Sqrt sqrt = new Sqrt(16.0);
        assertFalse(sqrt.good(4.1, 16.0));
    }

    @Test
    void testImprove() {
        Sqrt sqrt = new Sqrt(16.0);
        double improved = sqrt.improve(4.0, 16.0);
        assertEquals(4.0, improved, 0.0001);
    }

    @Test
    void testIterConverges() {
        Sqrt sqrt = new Sqrt(16.0);
        double result = sqrt.iter(2.0, 16.0);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    void testCalc() {
        Sqrt sqrt = new Sqrt(25.0);
        double result = sqrt.calc();
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testCalcZero() {
        Sqrt sqrt = new Sqrt(0.0);
        double result = sqrt.calc();
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testCalcSmallNumber() {
        Sqrt sqrt = new Sqrt(0.25);
        double result = sqrt.calc();
        assertEquals(0.5, result, 0.0001);
    }

    @Test
    void testCalcPrecision() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.calc();
        assertEquals(Math.sqrt(2.0), result, 0.0000001);
    }
}
