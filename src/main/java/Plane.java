public class Plane {

    private PlaneType type;

    public Plane(PlaneType type) {
        this.type = type;
    }

    public int getCapacity() {
        return type.getCapacity();
    }

    public int getWeight() {
        return type.getWeight();
    }
}
