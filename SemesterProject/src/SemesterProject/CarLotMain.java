package SemesterProject;

import java.util.*;
import java.io.IOException;

public class CarLotMain {

    // The main program that runs the Car Lot menu
    public static void main(String[] args) {
        CarLot carLot = new CarLot();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("[1] Add a car to inventory");
            System.out.println("[2] Sell a car from inventory");
            System.out.println("[3] Save To Disk");
            System.out.println("[4] Load From Disk");
            System.out.println("[5] List inventory by order of acquisition");
            System.out.println("[6] List Inventory From Best MPG to Worst MPG");
            System.out.println("[7] Display car with best MPG");
            System.out.println("[8] Display car with the highest mileage");
            System.out.println("[9] Display overall MPG for the entire inventory");
            System.out.println("[10] Display profit for all sold cars");
            System.out.println("Enter a number from 0 to 10: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Add a car to inventory
                    addCarToInventory(scanner, carLot);
                    break;
                case 2:
                    // Sell a car from inventory
                    sellCarFromInventory(scanner, carLot);
                    break;
                case 3:
                    // Save To Disk
                    try {
                        carLot.saveToDisk();
                        System.out.println("Inventory saved to disk.");
                    } catch (IOException e) {
                        System.out.println("Error saving to disk: " + e.getMessage());
                    }
                    break;
                case 4:
                    // Load From Disk
                    try {
                        carLot.loadFromDisk();
                        System.out.println("Inventory loaded from disk.");
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Error loading from disk: " + e.getMessage());
                    }
                    break;
                case 5:
                    // List inventory by order of acquisition
                    System.out.println("Listing inventory by order of acquisition:");
                    for (Car car : carLot.getCarsInOrderOfEntry()) {
                        System.out.println(car);
                    }
                    break;
                case 6:
                    // List Inventory From Best MPG to Worst MPG
                    System.out.println("Listing inventory from best MPG to worst MPG:");
                    for (Car car : carLot.getCarsSortedByMPG()) {
                        System.out.println(car);
                    }
                    break;
                case 7:
                    // Display car with best MPG
                    System.out.println("Car with best MPG:");
                    System.out.println(carLot.getCarWithBestMPG());
                    break;
                case 8:
                    // Display car with the highest mileage
                    System.out.println("Car with the highest mileage:");
                    System.out.println(carLot.getCarWithHighestMileage());
                    break;
                case 9:
                    // Display overall MPG for the entire inventory
                    System.out.println("Overall MPG for the entire inventory:");
                    System.out.println(carLot.getAverageMpg());
                    break;
                case 10:
                    // Display profit for all sold cars
                    System.out.println("Total profit for all sold cars:");
                    System.out.println(carLot.getTotalProfit());
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice, please enter a number from 0 to 10.");
            }
        }

        scanner.close();
    }

    private static void addCarToInventory(Scanner scanner, CarLot carLot) {
        System.out.println("Enter Car ID:");
        String id = scanner.nextLine();
        System.out.println("Enter Mileage:");
        int mileage = scanner.nextInt();
        System.out.println("Enter MPG:");
        int mpg = scanner.nextInt();
        System.out.println("Enter Cost:");
        double cost = scanner.nextDouble();
        System.out.println("Enter Sales Price:");
        double salesPrice = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        carLot.addCar(id, mileage, mpg, cost, salesPrice);
        System.out.println("Car added to inventory.");
    }

    private static void sellCarFromInventory(Scanner scanner, CarLot carLot) {
        System.out.println("Enter Car ID to sell:");
        String id = scanner.nextLine();
        System.out.println("Enter Sale Price:");
        double priceSold = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        carLot.sellCar(id, priceSold);
        System.out.println("Car sold.");
    }
}
