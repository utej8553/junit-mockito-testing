package com.example.testing;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAddition(){
        Calculator calc = new Calculator();
        int result = calc.add(2,3);
        assertEquals(5, result);
    }
}
