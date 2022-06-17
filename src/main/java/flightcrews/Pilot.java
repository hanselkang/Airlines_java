package flightcrews;

public class Pilot extends FlightCrew {

    private String pilotLicenceNumber;
    private static String name;

    private Rank rank;

    public Pilot(String name, Rank rank, String pilotLicenceNumber) {
        super(rank.getPosition());
        this.name = name;
        this.rank = rank;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public static String getName() {
        return name;
    }

    public String getPosition() {
        return rank.getPosition();
    }

    public Rank getRank(){
        return rank;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }


}

