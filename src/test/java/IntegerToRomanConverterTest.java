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

}