public class ServiceRecord {
    private String description;
    private double cost;
    private boolean status;

    public ServiceRecord(String description) {
        this.description = description;
        cost = 0;
        status = false;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public String getStatus() {
        if (status) {
            return "Complete";
        }
        return "Open";
    }

    public void addCharge(double amount) {
        if (valCharge(amount)) {
            cost += amount;
        }
    }

    public void completeRepair() {
        status = true;
    }

    private boolean valCharge(double amount) {
        if (amount > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Description: " + description + "; Cost: " + cost + "; Status: " + status;
    }
}