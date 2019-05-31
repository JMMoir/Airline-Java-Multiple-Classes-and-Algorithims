public class FlightManager {

    private Plane plane;

    public FlightManager(){
    }

    public int getTotalAvailableBagWeight(Plane plane) {
        return plane.getWeight() / 2;
    }

    public int getPassengerAllocationOfBaggage(Plane plane){
        int allowance = 0;
        allowance = getTotalAvailableBagWeight(plane) / plane.getCapacity();
        return allowance;
    }

    public int findRemainingBagSpace(Flight flight) {
        Plane plane = flight.getPlane();
        int totalCapacity = getTotalAvailableBagWeight(plane);
        int totalOnboard = flight.getTotalBagsOnboard();
        int allocation = getPassengerAllocationOfBaggage(plane);
        return totalCapacity - (totalOnboard * allocation);
    }

    public int getWeightOfBagsOnboard(Flight flight) {
        Plane plane = flight.getPlane();
        int totalOnboard = flight.getTotalBagsOnboard();
        int allocation = getPassengerAllocationOfBaggage(plane);
        return totalOnboard * allocation;
    }
}
