package planes;

public enum PlaneModel {

    B1("737", 60, 1000),
    B2("767", 120,2500),
    B3("777X",300,6000),
    A1("310",70,1200),
    A2("330",100,2200),
    A3("380",250,4200),
    P1("Airforce One",1,6000);

    private final String model;
    private final int capacity;
    private final int totalWeight;



    PlaneModel(String model, int capacity, int totalWeight){
        this.model = model;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

}
