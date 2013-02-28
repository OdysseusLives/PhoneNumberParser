import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

public class PhoneNumberTest {
    @Test
    public void getsPhoneNumberFromString() {
        PhoneNumber phoneNumber = new PhoneNumber("(111)222-3333");
        assertEquals("111", phoneNumber.getAreaCode());
        assertNotSame("", phoneNumber.getAreaCode());
    }

    @Test
    public void whenStringHasNoAreaCodeReturnNull() {
        PhoneNumber phoneNumber = new PhoneNumber("invalid");
        assertEquals(null, phoneNumber.getAreaCode());


    }
}
