public class Passenger {

    private String name;
    private int numberOfBags;
    private int seatNumber;

    public Passenger(String name, int numberOfBags, int seatNumber) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public void setSeatNumber(int generatedNumber){
        this.seatNumber = generatedNumber;
    }
}
