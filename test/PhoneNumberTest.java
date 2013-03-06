import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertTrue;

public class PhoneNumberTest {
    @Test
    public void getsAreaCodeFromString() {
        PhoneNumber phoneNumber = new PhoneNumber("(111)222-3333");
        assertTrue(111 == (phoneNumber.getAreaCode()));
    }

    @Test
    public void whenStringHasNoAreaCodeReturnNull() {
        PhoneNumber phoneNumber = new PhoneNumber("invalid");
        assertEquals(null, phoneNumber.getAreaCode());
    }

    @Test
    public void getsAreaCodeFromThreeIntegerInitializer() {
        PhoneNumber phoneNumber = new PhoneNumber(999, 888, 7777);
        assertTrue(999 == phoneNumber.getAreaCode());
    }

    @Test
    public void getsExtensionFromString() {
        PhoneNumber phoneNumber = new PhoneNumber("(123)456-7890 x5567");
        assertTrue(5567 == phoneNumber.getExtension());
    }
}
