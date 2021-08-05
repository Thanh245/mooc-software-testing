package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest2 {
    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "abc,3,def", "xyz,2,zab", "abc,-3,xyz", "a1c,4,invalid" })

    public void test (String message, int shift, String expectedResult) {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
