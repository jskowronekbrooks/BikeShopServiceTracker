public class BikeShop {
    public static final double LABOR_RATE = 70.0;
    private static int completedRepairs = 0;

    public static void serviceBike(Bicycle bike, double hours) {
        if (hours < 0.0) {
            System.out.println("Invalid hours");
        } else {
            ServiceRecord bikeRecord = bike.getServiceRecord();
            bikeRecord.addCharge(calculateLaborRate(hours));
            bikeRecord.completeRepair();
            completedRepairs++;
            System.out.println(
                "Bike Id: " + bike.getId() + 
                "; Owner: " + bike.getOwner() + "; Model: " + bike.getModel() + 
                "; Routine bicycle service: $" + bikeRecord.getCost() + " (" + 
                bikeRecord.getStatus() + ")"
            );
        }
    }

    public static int getTotalRepairs() {
        return completedRepairs;
    }


    private static double calculateLaborRate(double hours) {
        return LABOR_RATE * hours;
    }
}