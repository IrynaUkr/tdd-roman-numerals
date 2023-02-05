package org.tech.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToRomanConverterTest {
    IntegerToRomanConverter converter;

    @BeforeEach
    void seUp() {
        converter = new IntegerToRomanConverter();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldGenerateValidRoman(int input, String expected ){
        String actual =converter.convert(input);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnIWhenInputOne() {
        assertEquals("I", converter.convert(1));
    }

    @Test
    void shouldReturnIIWhenInputTwo() {
        assertEquals("II", converter.convert(2));
    }

    @Test
    void shouldReturnIIIWhenInputThree() {
        assertEquals("III", converter.convert(3));
    }

    @Test
    void shouldReturnIVWhenInputFour() {
        assertEquals("IV", converter.convert(4));
    }

    @Test
    void shouldReturnVWhenInputFive() {
        assertEquals("V", converter.convert(5));
    }

    @Test
    void shouldReturnVIWhenInputSix() {
        assertEquals("VI", converter.convert(6));
    }

    @Test
    void shouldReturnXWhenInputTen() {
        assertEquals("VI", converter.convert(6));
    }

    @Test
    void shouldReturnXLWhenInputForty() {
        assertEquals("XL", converter.convert(40));
    }

    @Test
    void shouldReturnLWhenInputFifty() {
        assertEquals("L", converter.convert(50));
    }

    @Test
    void shouldReturnXCWhenInputNignty() {
        assertEquals("XC", converter.convert(90));
    }

    @Test
    void shouldReturnCWhenInputHundred() {
        assertEquals("C", converter.convert(100));
    }

    @Test
    void shouldReturnCDWhenInputFourHunderd() {
        assertEquals("CD", converter.convert(400));
    }

    @Test
    void shouldReturn_D_WhenInputFiveHundreds() {
        assertEquals("D", converter.convert(500));
    }

    @Test
    void shouldReturn_CM_WhenInputNignty() {
        assertEquals("CM", converter.convert(900));
    }
    @Test
    void shouldReturn_M_WhenInputThousand() {
        assertEquals("M", converter.convert(1000));
    }

}
