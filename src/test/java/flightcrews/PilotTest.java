package flightcrews;


import org.junit.Before;
import org.junit.Test;

import static flightcrews.Rank.FIRST;
import static org.junit.Assert.*;

public class PilotTest {

    private Pilot pilot;


    @Before
    public void before(){
        pilot = new Pilot("Maisie",FIRST,"073222");

    }

    @Test
    public void hasName() {
        assertEquals("Maisie", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(FIRST, pilot.getRank());
    }

    @Test
    public void hasPosition(){
        assertEquals("Captain", pilot.getPosition());
    }

    @Test
    public void getPilotLicenceNumber() {
        assertEquals("073222", pilot.getPilotLicenceNumber());
    }

    @Test
    public void pilotCanTakeOffFlight() {
        assertEquals("Hello, we will have a perfect take-off",pilot.pilotFlyFlight());
    }

}