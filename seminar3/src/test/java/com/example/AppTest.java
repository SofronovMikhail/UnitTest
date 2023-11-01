package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
    @Test
    public void CacheNumberTrue() {
        assertTrue(MainHW.EvenOddNumber(20));
    }

    @Test
    public void CacheNumberFalse() {
        assertFalse(MainHW.EvenOddNumber(25));
    }

    @ParameterizedTest
    @ValueSource(ints = { 26, 77, 99, 33, 57 })
    public void testMethodNumberInIntervalTrue(int argument) {
        assertTrue(MainHW.NumberInInterval(argument));
    }

    @ParameterizedTest
    @ValueSource(ints = { 0, 25, 100, 150, 7 })
    public void testMethodNumberInIntervalFalse(int argument) {
        assertFalse(MainHW.NumberInInterval(argument));
    }
}
