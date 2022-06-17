public enum Rank {

    FIRST("Captain"),
    SECOND("First Officer"),
    THIRD("Purser"),
    FOURTH("Flight Attendant");

    private final String rank;

    Rank(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
