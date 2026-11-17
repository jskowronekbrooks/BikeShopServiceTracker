public class Main {
    public static void main(String[] args) {
        Bicycle bikeA = new Bicycle("Jeremy", "Explorer");
        Bicycle bikeB = new Bicycle("Chris", "Roadster");


        System.out.println("INITIAL BYCYCLES");
        System.out.println("Bike A: " + bikeA);
        System.out.println("Bike B: " + bikeB);
        System.out.println();


        System.out.println("AFTER RIDES");
        int validMileage = 630;
        int invalidMileage = -20;
        int secondMileage = 450;

        bikeA.ride(validMileage);
        bikeB.ride(invalidMileage);
        System.out.println("Bike A mileage after riding " + validMileage + " miles: " 
            +  bikeA.getMileage());
        System.out.println("Bike B mileage after riding " + invalidMileage + " miles: " 
            +  bikeB.getMileage());
        bikeB.ride(secondMileage);
        System.out.println("Bike B mileage after riding " + secondMileage + " miles: " 
            +  bikeB.getMileage());
        System.out.println("Bike A needs service (expect true): " + bikeA.needsService());
        System.out.println("Bike B needs service (expect false): " + bikeB.needsService());
        System.out.println();

        
        System.out.println("ALIASING");
        Bicycle clone = bikeA;
        int cloneDistance = 45;
        clone.ride(cloneDistance);

        System.out.println("Bike A mileage after clone rides " + cloneDistance + 
            " miles (expect 675): " + bikeA.getMileage());
        System.out.println();


        System.out.println("AFTER SERVCE");
        double bikeAServiceHours = 3.5;
        double bikeBServiceHours = 2;

        BikeShop.serviceBike(bikeA, bikeAServiceHours);
        BikeShop.serviceBike(bikeB, bikeBServiceHours);
    }
}