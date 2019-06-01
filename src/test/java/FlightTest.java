import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

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
        Passenger passenger = new Passenger("John", 2, 10);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        assertEquals(2, flight.countPassengersOnFlight());
    }

    @Test
    public void checkNumberOfAvailableSeatsLeft() {
        Passenger passenger = new Passenger("John", 2, 10);
        flight.addPassengerToFlight(passenger);
        assertEquals(415, flight.countRemainingSeat());
    }

    @Test
    public void checkCanBookPassengerOnFlight() {
        Passenger passenger = new Passenger("John", 2, 10);
        flight.checkAvailabilityAndBook(passenger);
        assertEquals(415, flight.countRemainingSeat());
    }

    @Test
    public void canTotalNumberOfBagsOnboard() {
        Passenger passenger = new Passenger("John", 2, 10);
        flight.checkAvailabilityAndBook(passenger);
        flight.checkAvailabilityAndBook(passenger);
        flight.checkAvailabilityAndBook(passenger);
        assertEquals(6, flight.getTotalBagsOnboard());
    }

    @Test
    public void canGetDepartureTime() {
        GregorianCalendar time = new GregorianCalendar(2018, 6, 27, 16, 16, 47);
        assertEquals(time, flight.setDepartTime(time));
    }

    @Test
    public void canGenerateAndCheckSeatNumbers() {
        Passenger passenger1 = new Passenger("John", 2, 10);
        flight.addPassengerToFlight(passenger1);
        Passenger passenger2 = new Passenger("John", 2, 10);
        flight.addPassengerToFlight(passenger2);
        assertNotEquals(passenger1.getSeatNumber(), passenger2.getSeatNumber());
    }
}
