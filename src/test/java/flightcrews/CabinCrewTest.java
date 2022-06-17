package flightcrews;

import org.junit.Before;
import org.junit.Test;

import static flightcrews.Rank.*;
import static org.junit.Assert.*;

public class CabinCrewTest {

    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;

    @Before
    public void before(){

        cabinCrew1 = new CabinCrew("Kevin",FOURTH);
        cabinCrew2 = new CabinCrew("Craw",THIRD);


    }

    @Test
    public void getName() {
        assertEquals("Kevin",cabinCrew1.getName());
    }

    @Test
    public void getPosition() {
        assertEquals("Flight Attendant",cabinCrew1.getPosition());
    }

    @Test
    public void getRank() {
        assertEquals(THIRD,cabinCrew2.getRank());
    }

    @Test
    public void canTell() {
        assertEquals("Please press the button if you need any help",cabinCrew1.canTell());
    }
}