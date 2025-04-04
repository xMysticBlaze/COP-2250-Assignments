package SemesterProject;

import java.util.*;
import java.io.*;

public class CarLot {
    private ArrayList<Car> inventory = new ArrayList<>();

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Car> inventory) {
        this.inventory = inventory;
    }

    public Car findCarByIdentifier(String identifier) {
        for (Car car : inventory) {
            if (car.getID().equals(identifier)) {
                return car;
            }
        }
        return null;
    }

    public ArrayList<Car> getCarsInOrderOfEntry() {
        return new ArrayList<>(inventory);
    }

    public ArrayList<Car> getCarsSortedByMPG() {
        ArrayList<Car> sortedByMPG = new ArrayList<>(inventory);
        selectionSort(sortedByMPG);
        return sortedByMPG;
    }

    private void selectionSort(ArrayList<Car> sortedByMPG) {
        int n = sortedByMPG.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sortedByMPG.get(j).getMPG() > sortedByMPG.get(maxIndex).getMPG()) {
                    maxIndex = j;
                }
            }
            Collections.swap(sortedByMPG, i, maxIndex);
        }
    }

    public Car getCarWithBestMPG() {
        return Collections.max(inventory, Comparator.comparingInt(Car::getMPG));
    }

    public Car getCarWithHighestMileage() {
        return Collections.max(inventory, Comparator.comparingInt(Car::getMileage));
    }

    public double getAverageMpg() {
        return inventory.stream().mapToInt(Car::getMPG).average().orElse(0.0);
    }

    public double getTotalProfit() {
        return inventory.stream().filter(car -> car.getIsSold().equals("Yes")).mapToDouble(Car::getProfit).sum();
    }

    public void addCar(String id, int mileage, int mpg, double cost, double salesPrice) {
        Car newCar = new Car(id, mileage, mpg, cost, salesPrice);
        inventory.add(newCar);
    }

    public void sellCar(String identifier, double priceSold) {
        Car car = findCarByIdentifier(identifier);
        if (car != null) {
            car.sellCar(priceSold);
        }
    }

    public void saveToDisk() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car_lot.dat"))) {
            oos.writeObject(inventory);
        }
    }

    public ArrayList<Car> loadFromDisk() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car_lot.dat"))) {
            inventory = (ArrayList<Car>) ois.readObject();
        }
        return inventory;
    }
}
