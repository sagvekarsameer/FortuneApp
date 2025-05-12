package org.fortune;

import static org.junit.Assert.*;
import org.junit.Test;

public class FortuneTellerTest {
    @Test
    public void testFortuneTellerReturnsNonEmptyString() {
        FortuneTeller teller = new FortuneTeller();
        String fortune = teller.tellFortune();
        assertNotNull(fortune);
        assertTrue(fortune.length() > 0);
    }
}
