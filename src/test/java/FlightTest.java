import com.beust.ah.A;
import flightcrews.CabinCrew;
import flightcrews.FlightCrew;
import flightcrews.Pilot;
import org.junit.Before;
import org.junit.Test;
import planes.Plane;

import java.util.ArrayList;

import static flightcrews.Rank.*;
import static org.junit.Assert.*;
import static planes.PlaneModel.*;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Flight flight3;
    Plane plane1;
    Plane plane2;

    Plane plane3;

    ArrayList<Pilot> pilots;

    ArrayList<FlightCrew> flightCrews;

    ArrayList<CabinCrew> cabinCrews;
    Passenger passenger1;
    Passenger passenger2;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;

    @Before
    public void before(){
        pilots = new ArrayList<>();
        flightCrews = new ArrayList<>();
        cabinCrews = new ArrayList<>();
        plane1 = new Plane(A1);
        plane2 = new Plane(B1);
        plane3 = new Plane(P1);
        flight1 = new Flight(plane1,"EDX002","EDI","GLA","13:25");
        flight2 = new Flight(plane2,"EDX391","GLA","EDI","22:00");
        flight3 = new Flight(plane3, "ANE","WDC","HDX","10:00");
        passenger1 = new Passenger("Alice",3);
        passenger2 = new Passenger("Brad",2);
        pilot1 = new Pilot("Hans",FIRST,"0739921");
        pilot2 = new Pilot("Dove",FIRST,"0739921");
        cabinCrew1 = new CabinCrew("Andrew",THIRD);
        cabinCrew2 = new CabinCrew("Jenny",FOURTH);
    }

    @Test
    public void canAddPilot(){
        flight1.addPilot(pilot1);
        assertEquals(1,flight1.getPilotsList().size());
    }


    @Test
    public void getCabinCrews() {
        flight1.addCabinCrew(cabinCrew1);
        flight1.addCabinCrew(cabinCrew2);
        assertEquals(2,flight1.getCabinCrewList().size());
    }




    @Test
    public void hasFlightNumber() {
        assertEquals("EDX002", flight1.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("GLA", flight2.getDestination());
    }

    @Test
    public void hasDeparture() {
        assertEquals("EDI", flight2.getDeparture());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("13:25",flight1.getDepartureTime());
    }


    @Test
    public void hasRemainedSeats() {
        flight1.setBookedPassengers(passenger1);
        flight1.setBookedPassengers(passenger2);
        assertEquals(68,flight1.remainedSeats());
    }

    @Test
    public void canBookPassengers() {
        flight2.bookPassengers(passenger1);
        assertEquals("Enjoy your journey with us",flight2.bookPassengers(passenger2));
    }

    @Test
    public void cannotBookPassengers() {
        flight3.setBookedPassengers(passenger1);
        assertEquals("Sorry, there is no seat left",flight3.bookPassengers(passenger2));
    }
}