package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
            void twoPlusThreeEqualsFive() {
        SimpleCalculator calculation = new SimpleCalculator();
        assertEquals(14, calculation.add(7, 7));

    }




}