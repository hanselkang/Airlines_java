import flightcrews.*;
import planes.Plane;
import planes.PlaneModel;

import java.util.ArrayList;
import java.util.Collection;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private ArrayList<FlightCrew> flightCrews;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrews;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departure;
    private String departureTime;



    public Flight(Plane plane, String flightNumber, String destination, String departure, String departureTime) {
        this.bookedPassengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.pilots = new ArrayList<>();
        this.cabinCrews = new ArrayList<>();
        this.flightCrews = new ArrayList<>();
    }


    public ArrayList<Pilot> getPilotsList() {
        return pilots;
    }

    public ArrayList<CabinCrew> getCabinCrewList() {
        return cabinCrews;
    }
    public void addPilot(Pilot pilot) {
        pilots.add(0,pilot);
    }


    public void addCabinCrew(CabinCrew cabinCrew){
        cabinCrews.add(cabinCrew);

    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }


    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setBookedPassengers(Passenger passengers){
        bookedPassengers.add(passengers);
    }

    public int remainedSeats(){
        if (plane.getPlaneModel().getCapacity() > bookedPassengers.size()){
            return plane.getPlaneModel().getCapacity() - bookedPassengers.size();
        }
        else {
            return 0;
        }
    }

    public String bookPassengers(Passenger passenger){
        if (bookedPassengers.size() < plane.getCapacity()){
            bookedPassengers.add(passenger);
            return "Enjoy your journey with us";
        }
        else{
            return "Sorry, there is no seat left";
        }
    }


}
