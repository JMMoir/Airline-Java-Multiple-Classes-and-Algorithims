import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private Plane plane;
    private ArrayList<Passenger> passengerList;
    private AirportCode departure;
    private AirportCode destination;

    public Flight(String flightNumber, Plane plane, AirportCode departure, AirportCode destination) {
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
        passengerList = new ArrayList<Passenger>();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public AirportCode getDepartureAirport() {
        return this.departure;
    }

    public AirportCode getDestination() {
        return this.destination;
    }
}
