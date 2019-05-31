public enum PlaneType {
    BOEING747(416, 330000),
    AIRBUSA380(555, 361000);

    private int capacity;
    private int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }
}
