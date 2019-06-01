import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void canBubbleSort() {
        Passenger passenger = new Passenger("John", 1 ,6  );
        Passenger passenger3 = new Passenger("John", 1 ,3  );
        Passenger passenger4 = new Passenger("John", 1 ,200 );
        Passenger passenger2 = new Passenger("John", 1 ,1  );
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        flight.addPassengerToFlight(passenger4);
        ArrayList<Passenger> passengerArrayList = flight.getPassengerList();
        System.out.println(flight.getPassengerList());
        flightManager.bubbleSort(passengerArrayList);
        System.out.println(flight.getPassengerList());
    }

    @Test
    public void canBinarySearch() {
        Passenger passenger = new Passenger("John", 1 ,200  );
        Passenger passenger3 = new Passenger("John", 1 ,200 );
        Passenger passenger4 = new Passenger("John", 1 ,200 );
        Passenger passenger2 = new Passenger("John", 1 ,200 );
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger);
        flight.addPassengerToFlight(passenger2);
        flight.addPassengerToFlight(passenger3);
        flight.addPassengerToFlight(passenger4);
        ArrayList<Passenger> passengerArrayList = flight.getPassengerList();
        assertTrue(flightManager.binarySearch(passengerArrayList,200));
    }
}
