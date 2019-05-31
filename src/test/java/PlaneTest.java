import org.junit.Before;

public class PlaneTest {

    private Plane plane;

    @Before

    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
    }

}
