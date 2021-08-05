package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.caesarshift.CaesarShiftCipher;

public class GHappyTest2 {

    @ParameterizedTest(name = "str={0}, result={1}")
    @CsvSource({ "xxgxx,false", "xxggxx,true", "ggxx,true", "xxgg,true" , "xxggyygxx,false"})

    public void test (String str, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }

}
