package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoValues() {
        //given
        int expectedResult = 30;
        //when
        int result = calculator.add(10, 20);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldSubtractTwoValues() {
        //given
        int expectedResult = 5;
        //when
        int result = calculator.subtract(10, 5);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldMultiplyTwoValues() {
        //given
        int expectedResult = 6;
        //when
        int result = calculator.multiply(2, 3);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldDivideTwoValues() {
        //given
        int expectedResult = 2;
        //when
        float result = calculator.divide(6, 3);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }
}