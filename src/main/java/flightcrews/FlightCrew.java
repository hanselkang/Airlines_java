package flightcrews;

import java.util.ArrayList;

public abstract class FlightCrew {

    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Pilot> pilots;

    private String rank;

    public FlightCrew(String rank) {
        this.rank = rank;
        this.cabinCrews = new ArrayList<CabinCrew>();
        this.pilots = new ArrayList<Pilot>();
    }


    public ArrayList<CabinCrew> getCabinCrews() {
        return cabinCrews;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

}
