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

}