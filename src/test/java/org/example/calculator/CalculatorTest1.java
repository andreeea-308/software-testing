package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {

    @Test
    public void sum_whenParameters10And15_thenResultIs25() {
        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(10, 15);
        assertEquals(25, sumResult);
    }

    @Test
    public void difference_whenParameters20And3_thenResultIs17() {
        Calculator calculator = new Calculator();
        int differenceResult = calculator.difference(20, 3);
        assertEquals(17, differenceResult);
    }

    @Test
    public void divide_whenParameters20And5_thenResultIs4() {
        int divideResult = 0;
        try {
            Calculator calculator = new Calculator();
            divideResult = calculator.divide(20, 5);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception occured while trying to divide 20 at 0");
        }
        assertEquals(4, divideResult);
    }

    @Test
    public void divide_whenParam2Is0_thenExceptionIsTrue() {
        Calculator calculator = new Calculator();
        assertThrows(Exception.class, () -> calculator.divide(20, 0));
    }


    @Test
    public void factor_whenParameters2And3_thenResultIs6() {
        Calculator calculator = new Calculator();
        int factorResult = calculator.factor(2, 3);
        assertEquals(6, factorResult);
    }
}