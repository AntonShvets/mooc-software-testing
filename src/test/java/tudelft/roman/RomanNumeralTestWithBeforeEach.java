package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void numberWithMOnly() {
        int result = roman.convert("MMMVM");
        Assertions.assertEquals(3995, result);
    }

    @Test
    public void numberWithM() {
        int result = roman.convert("MMMMI");
        Assertions.assertEquals(4001, result);
    }

    @Test
    public void numberWithIC() {
        int result = roman.convert("IC");
        Assertions.assertEquals(99, result);
    }

    @Test
    public void wrongNumber() {
        int result = roman.convert("VX");
        Assertions.assertEquals(99, result);
    }
}
