package SemesterProject;

import java.io.Serializable;

public class Car implements Serializable {
    private String id = "";
    private int mileage = 0;
    private int mpg = 0;
    private double cost = 0.0;
    private double salesPrice = 0.0;
    private boolean isSold = false;
    private double priceSold = 0.0;
    private double profit = 0.0;

    public Car() {
    }

    public Car(String id, int mileage, int mpg, double cost, double salesPrice) {
        this.id = id;
        this.mileage = mileage;
        this.mpg = mpg;
        this.cost = cost;
        this.salesPrice = salesPrice;
    }

    public String getID() {
        return id;
    }

    public int getMileage() {
        return mileage;
    }

    public int getMPG() {
        return mpg;
    }

    public double getCost() {
        return cost;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public double getPriceSold() {
        return priceSold;
    }

    public String getIsSold() {
        return isSold ? "Yes" : "No";
    }

    public double getProfit() {
        return profit;
    }

    public String toString() {
        return "Car ID: " + id + ", Mileage: " + mileage + ", MPG: " + mpg +
                ", Cost: $" + cost + ", Sales Price: $" + salesPrice +
                ", Sold: " + getIsSold() + ", Price Sold: $" + priceSold +
                ", Profit: $" + profit;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setMPG(int mpg) {
        this.mpg = mpg;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public void sellCar(double priceSold) {
        this.isSold = true;
        this.priceSold = priceSold;
        this.profit = priceSold - cost;
    }

    public int compareMPG(Car otherCar) {
        return Integer.compare(this.mpg, otherCar.mpg);
    }

    public int compareMiles(Car otherCar) {
        return Integer.compare(this.mileage, otherCar.mileage);
    }

    public int comparePrice(Car otherCar) {
        return Double.compare(this.salesPrice, otherCar.salesPrice);
    }
}
