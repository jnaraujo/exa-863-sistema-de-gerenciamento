package domain.value_objects;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {


    @Test
    void getPhone() throws Exception {
        assertEquals("1234567890", new PhoneNumber("1234567890").getPhone());
    }

    @org.junit.jupiter.api.Test
    void setPhone() {
        assertThrows(Exception.class, () -> new PhoneNumber("123456789"));
    }
}