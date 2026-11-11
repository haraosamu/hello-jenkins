package jp.co.hara;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void addTest() {

        Calculator calculator = new Calculator();

        assertEquals(6, calculator.add(2,3));

    }

}