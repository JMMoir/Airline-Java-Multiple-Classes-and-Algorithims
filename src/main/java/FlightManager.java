import java.util.ArrayList;

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

    public void bubbleSort(Flight flight){
            ArrayList<Passenger> unSortedArray = flight.getPassengerList();

            int length = unSortedArray.size();

            for(int i = 0; i < length-1 ; i++){
                for(int i2 = 0; i2 <length-1; i2++){
                    if(unSortedArray.get(i2).getSeatNumber() > unSortedArray.get(i2+1).getSeatNumber()){
                        Passenger temp = unSortedArray.get(i2);
                        Passenger temp2 = unSortedArray.get(i2+1);
                        unSortedArray.set(i2,temp2);
                        unSortedArray.set(i2+1,temp);
                    }
                }
            }
        }
}

