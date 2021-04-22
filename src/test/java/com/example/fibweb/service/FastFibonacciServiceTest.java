package com.example.fibweb.service;

import com.example.fibweb.service.FastFibonacciService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastFibonacciServiceTest {
    private FastFibonacciService fibber = new FastFibonacciService();

    @Test
    void shouldBe0() {
        assertEquals(0, fibber.compute(0));
    }
    @Test
    void firstShouldBe1() {
        assertEquals(1, fibber.compute(1));
    }
    @Test
    void secondShouldBe1() {
        assertEquals(1, fibber.compute(2));
    }
    @Test
    void eighthShouldBe1() {
        assertEquals(21, fibber.compute(8));
    }
    @Test
    void shouldBeFast() {
        assertEquals(1134903170, fibber.compute(45));
    }
}