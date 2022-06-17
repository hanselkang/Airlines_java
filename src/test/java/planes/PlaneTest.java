package planes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static planes.PlaneModel.B1;

public class PlaneTest {
    private Plane plane1;

    @Before
    public void before(){
        plane1 = new Plane(B1);

    }

    @Test
    public void getCapacity() {
        assertEquals(60,plane1.getCapacity());
    }

    @Test
    public void getWeight() {
        assertEquals(1000,plane1.getWeight());
    }

    @Test
    public void getModel() {
        assertEquals("737",plane1.getModel());
    }

    @Test
    public void getPlaneModel() {
        assertEquals(B1,plane1.getPlaneModel());
    }
}