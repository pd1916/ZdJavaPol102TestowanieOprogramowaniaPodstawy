package pl.sdacademy.unit.test.basic.exercises.unit.task4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ConverterNaturalNumberTest {
    private static ConverterNaturalNumber converterNaturalNumber;
    private static final int FIRST_NATURAL_NUMBER = 0;

    @BeforeAll
    static void init() {
        converterNaturalNumber = new ConverterNaturalNumber();
    }

    @Test
    void shouldReturnStringFromNumberIfNumberIsGreaterThanZero() {
        //given
        int i = FIRST_NATURAL_NUMBER + 1;
        String expectedResult = "1";
        //when
        String result = converterNaturalNumber.toStringFromNaturalNumber(i);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnStringFromNumberIfNumberIsEqualZero() {
        //given
        String expectedResult = "0";
        //when
        String result = converterNaturalNumber.toStringFromNaturalNumber(0);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    // przypadek z wyjątkami, których jeszcze nie mieliście
    @Test
    void shouldThrowExceptionIfNumberIsLessThanZero() {
        //given
        int i = FIRST_NATURAL_NUMBER - 1;
        //when

        //junit5
        assertThrows(IllegalArgumentException.class,
                () -> converterNaturalNumber.toStringFromNaturalNumber(i), "Given number is less that 0!");

        //assertJ
        assertThatThrownBy(() -> converterNaturalNumber.toStringFromNaturalNumber(i))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Given number is less that 0!");
    }
}