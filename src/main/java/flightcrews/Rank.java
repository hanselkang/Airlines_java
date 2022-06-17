package flightcrews;

public enum Rank {

    FIRST("Captain"),
    SECOND("First Officer"),
    THIRD("Purser"),
    FOURTH("Flight Attendant");

    private final String position;

    Rank(String position){
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
