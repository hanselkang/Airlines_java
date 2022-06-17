package flightcrews;

public class CabinCrew extends FlightCrew{
    private String name;
    private Rank rank;

    public CabinCrew(String name, Rank rank) {
        super(rank.getPosition());
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getPosition() {
        return rank.getPosition();
    }

    public String canTell() {
        return "Please press the button if you need any help";
    }
}
