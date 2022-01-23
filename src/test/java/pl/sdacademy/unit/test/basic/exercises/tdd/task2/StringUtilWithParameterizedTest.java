package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilWithParameterizedTest {
    @ParameterizedTest
    @ValueSource(strings = {" a", " a ", "a ", "sda", "bla bla"})
    void shouldReturnFalseIfStringIsNotEmpty(String input) {
        //when
        boolean result = StringUtilWithParameterized.isBlank(input);
        //then
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    void shouldReturnTrueIfStringIsEmpty(String input) {
        //when
        boolean result = StringUtilWithParameterized.isBlank(input);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueIfStringIsNull() {
        //when
        boolean result = StringUtilWithParameterized.isBlank(null);
        //then
        assertTrue(result);
    }
}