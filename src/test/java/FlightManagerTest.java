import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Plane plane;
    private Passenger passenger;
    private Flight flight;


    @Before

    public void setUp() {
        flightManager = new FlightManager();
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight("FR5775", plane, AirportCode.GLASGOW, AirportCode.DUBLIN);
    }

    @Test
    public void canGetTotalAvailableBagWeight() {
        assertEquals(165000, flightManager.getTotalAvailableBagWeight(plane));
    }

    @Test
    public void canGetBaggageAllocationPerPassenger() {
        assertEquals(396, flightManager.getPassengerAllocationOfBaggage(plane));
    }

    @Test
    public void remainingBagAllowanceOnFlight() {
        Passenger passenger = new Passenger("John", 1 ,10  );
        flight.addPassengerToFlight(passenger);
        assertEquals(164604, flightManager.findRemainingBagSpace(flight));
    }

    @Test
    public void canGetWeightOfBagsOnboard() {
        Passenger passenger = new Passenger("John", 1 ,10  );
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        assertEquals(792, flightManager.getWeightOfBagsOnboard(flight));
    }
}
