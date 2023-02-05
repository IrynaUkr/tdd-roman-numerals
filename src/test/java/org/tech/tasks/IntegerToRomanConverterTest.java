package org.tech.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToRomanConverterTest {
    IntegerToRomanConverter converter;

    @BeforeEach
    void seUp() {
        converter = new IntegerToRomanConverter();
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
}
