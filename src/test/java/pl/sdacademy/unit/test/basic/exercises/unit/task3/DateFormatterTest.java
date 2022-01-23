package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateFormatterTest {

    @Test
    void shouldReturnFormatDateToYearDayMonth() {
        // given
        String expectedResult = "1900-02-01";
        LocalDate inputData = LocalDate.of(1900, 01, 02);
        DateFormatter dateFormatter = new DateFormatter();
        //when
        String result = dateFormatter.formatDate(inputData);
        //then
        assertEquals(expectedResult, result);
    }
}