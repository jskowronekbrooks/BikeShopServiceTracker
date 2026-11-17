public class Bicycle {
    private static int nextId = 1;
    private static int serviceMileage = 500;

    private String owner, model;
    private int mileage;
    private final int id;
    private ServiceRecord record;
    
    public Bicycle(String owner, String model) {
        this.owner = owner;
        this.model = model;
        mileage = 0;

        id = nextId;
        nextId++;

        ServiceRecord record = new ServiceRecord("Owner: " + owner + "Model: " + model);
        this.record = record;
    }

    public void ride(int miles) {
        if (miles > 0) {
            mileage += miles;
        }
    }

    public boolean needsService() {
        if (mileage > serviceMileage) {
            return true;
        }
        return false;
    }

    public String getOwner() {
        return owner;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public int getId() {
        return id;
    }

    public ServiceRecord getServiceRecord() {
        return record;
    }

    public String toString() {
        return "Owner: " + owner + "; ID: " + id + "; Model: " + model 
            + "; Service Cost: " + record.getCost() + " (" + record.getStatus() + ")";
    }
}