import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PassengerTest {

    private Passenger passenger;

    @Before

    public void setUp() {
        passenger = new Passenger("John", 1);
    }

    @Test
    public void canGetName() {
        assertEquals("John", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(1, passenger.getNumberOfBags());
    }
}
