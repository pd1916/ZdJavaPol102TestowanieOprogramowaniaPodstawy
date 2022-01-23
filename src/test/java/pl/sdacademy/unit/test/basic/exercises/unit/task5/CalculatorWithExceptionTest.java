package pl.sdacademy.unit.test.basic.exercises.unit.task5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorWithExceptionTest {
    private static CalculatorWithException calculator;

    @BeforeAll
    static void init() {
        calculator = new CalculatorWithException();
    }

    @Test
    void shouldDivisionTwoValues() {
        //given
        float expectedResult = 2.0f;
        //when
        float result = calculator.divide(6, 3);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    // przypadek z wyjątkami, których jeszcze nie mieliście
    @Test
    void shouldThrowExceptionIfSecondNumberIsEqualZero() {
        //junit5
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(2, 0), "Cannot divide by zero!");

        //assertJ
        assertThatThrownBy(() -> calculator.divide(2, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Cannot divide by zero!");
    }

}