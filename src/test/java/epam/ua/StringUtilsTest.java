package epam.ua;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"100", "1", "+56534","+994212","99"})
    void isTrue_isPositiveNumber(String input) {
        assertTrue(StringUtils.isPositiveNumber(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-100", "-1", "-56534","-0","0","-0212"})
    void isFalse_isPositiveNumber(String input) {
        assertFalse(StringUtils.isPositiveNumber(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2342fwqe", "sdfgss", "-354twges4qg ","-----++++"," ","\n"})
    void isException_isPositiveNumber(String input) {
        assertThrows(NumberFormatException.class, () -> {
            StringUtils.isPositiveNumber(input);
        });
    }
}
