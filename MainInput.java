import java.util.Scanner;

public class MainInput {
    private static String owner, model;
    private static int miles;
    private static double serviceHours;
    private static boolean anotherBike = true;

    public static void main(String[] args) {
        while (anotherBike) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter owner: ");
            owner = sc.nextLine();

            System.out.print("Enter model: ");
            model = sc.nextLine();

            System.out.print("Enter mileage: ");
            miles = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter service hours: ");
            serviceHours = sc.nextDouble();
            sc.nextLine();

            Bicycle bike = new Bicycle(owner, model);
            bike.ride(miles);

            System.out.print("Service Information: ");
            BikeShop.serviceBike(bike, serviceHours);

            System.out.print("Service another bike (y/n)?: ");
            String choice = sc.nextLine();

            if (choice.equals("n") || choice.equals("N")) {
                anotherBike = false;
                sc.close();
            }
        }
    }
}
