import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PlaneTest {

    private Plane plane;

    @Before

    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(416, plane.getCapacity());
    }

    @Test
    public void planeHasWright() {
        assertEquals(330000, plane.getWeight());
    }
}
