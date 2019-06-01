import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Flight {

    private String flightNumber;
    private Plane plane;
    private ArrayList<Passenger> passengerList;
    private AirportCode departure;
    private AirportCode destination;
    private GregorianCalendar departureTime;

    public Flight(String flightNumber, Plane plane, AirportCode departure, AirportCode destination) {
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
        passengerList = new ArrayList<Passenger>();
        departureTime = new GregorianCalendar();
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

    public int countPassengersOnFlight(){
        return passengerList.size();
    }

    public void addPassengerToFlight(Passenger passenger){
        passengerList.add(passenger);
    }

    public int countRemainingSeat(){
        return plane.getCapacity() - passengerList.size();
    }

    public void checkAvailabilityAndBook(Passenger passenger) {
        if(countRemainingSeat() > 0){
            addPassengerToFlight(passenger);
        }
    }

    public int getTotalBagsOnboard(){
        int numberOfBags = 0;
        for(Passenger passenger: passengerList){
            numberOfBags+= passenger.getNumberOfBags();
        }
        return numberOfBags;
    }

    public GregorianCalendar setDepartTime(GregorianCalendar departTime) {
        departureTime = departTime;
        return departureTime;
    }
}
