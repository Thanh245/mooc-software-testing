package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void  Test1() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void  Test2() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void  Test3() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("ggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void  Test4() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxgg");
        Assertions.assertTrue(result);
    }

    @Test
    public void  Test5() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }


}
