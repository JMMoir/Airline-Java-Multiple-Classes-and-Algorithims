import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;
    private Plane plane;

    @Before

    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight("FR5775", plane, AirportCode.GLASGOW, AirportCode.DUBLIN);
    }

    @Test
    public void flightHasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasNumber() {
        assertEquals("FR5775", flight.getFlightNumber());
    }

    @Test
    public void flightHasDepartAirport() {
        assertEquals(AirportCode.GLASGOW, flight.getDepartureAirport());
    }

    @Test
    public void flightHasDestination() {
        assertEquals(AirportCode.DUBLIN, flight.getDestination());
    }

    @Test
    public void getPassengerCount() {
        assertEquals(0, flight.countPassengersOnFlight());
    }

    @Test
    public void checkPassengerAddedToFlight() {
        Passenger passenger = new Passenger("John", 2);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        assertEquals(2, flight.countPassengersOnFlight());
    }
}
