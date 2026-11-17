public class Bicycle {
    private static final int SERVICE_MILEAGE = 500;
    private static int nextId = 1;

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

        ServiceRecord record = new ServiceRecord("Owner: " + owner + " Model: " + model);
        this.record = record;
    }

    public void ride(int miles) {
        if (miles > 0) {
            mileage += miles;
        }
    }

    // Needs service if mileage is above 500 miles
    public boolean needsService() {
        if (mileage > SERVICE_MILEAGE) {
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