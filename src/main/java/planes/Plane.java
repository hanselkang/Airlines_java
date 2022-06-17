package planes;


public class Plane {

    private int capacity;
    private int weight;
    private String model;

    private PlaneModel planeModel;


    public Plane(PlaneModel planeModel) {
        this.planeModel = planeModel;


    }

    public int getCapacity() {
        return planeModel.getCapacity();
    }

    public int getWeight() {
        return planeModel.getTotalWeight();
    }

    public String getModel() {
        return planeModel.getModel();
    }

    public PlaneModel getPlaneModel() {
        return planeModel;
    }

}
