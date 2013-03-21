import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class CallTest {

    @Test
    public void callPhoneNumber() {
        PhoneNumber phoneNumber = mock(PhoneNumber.class);
        when(phoneNumber.getAreaCode()).thenReturn(999);

        Call call = new Call(phoneNumber);
        assertTrue(call.isLongDistance());

    }
}
