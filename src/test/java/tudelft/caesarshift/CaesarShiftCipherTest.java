package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void  Test1() {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }

    @Test
    public void  Test2() {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher("xyz", 2);
        Assertions.assertEquals("zab", result);
    }

    @Test
    public void  Test3() {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher("abc", -3);
        Assertions.assertEquals("xyz", result);
    }

    @Test
    public void  Test4() {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher("a1c", 6);
        Assertions.assertEquals("invalid", result);
    }
}
