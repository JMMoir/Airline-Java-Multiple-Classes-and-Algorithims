import java.util.ArrayList;

public class FlightManager {


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

    public void bubbleSort(ArrayList<Passenger> unSortedArray){

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

        public  Passenger binarySearch(ArrayList<Passenger> passengerArrayList, int seatNumber){
            if(passengerArrayList.size() == 0){
                return null;
            }
            bubbleSort(passengerArrayList);
            int length = passengerArrayList.size();
            int midIndex = (length -1) /2;
            Passenger midPassenger = passengerArrayList.get(midIndex);
            int listNum = midPassenger.getSeatNumber();
            if( listNum == seatNumber){
                return midPassenger;
            }

            ArrayList<Passenger> newSearchArray;
            if(listNum < seatNumber){
                newSearchArray = new ArrayList<Passenger>(passengerArrayList.subList(midIndex + 1, passengerArrayList.size()));
            } else {
                newSearchArray = new ArrayList<Passenger>(passengerArrayList.subList(0, midIndex));
            }
            return binarySearch(newSearchArray, seatNumber);
        }

}

