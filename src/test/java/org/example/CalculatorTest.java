package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
        public void setUp(){
        calculator = new Calculator();
    }

    @AfterEach
        public void tearDown(){
        calculator = null;
    }

    @Test
        public void addTest(){
        assertEquals(10,calculator.add(5,5));
    }

    @Test
        public void subTest(){
        assertEquals(4,calculator.sub(8,4));
    }
    @Test
        public void mulTest(){
        assertEquals(16,calculator.mul(4,4));
    }
    @Test
        public void divTest(){
        assertEquals(2,calculator.div(10,5));
    }
}
