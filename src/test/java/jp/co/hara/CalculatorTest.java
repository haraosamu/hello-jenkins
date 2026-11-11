package jp.co.hara;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void addTest() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2,3));

    }

}