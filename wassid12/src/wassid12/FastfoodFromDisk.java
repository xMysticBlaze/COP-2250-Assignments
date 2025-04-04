package wassid12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FastfoodFromDisk {

    public static void main(String[] args) {
        ArrayList<Fastfood> fastfoods = new ArrayList<>();
        double totalCost = 0;

        try {
            File file = new File("fastfood.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.trim().split("\\s+");
                String restaurant = data[0] + " " + data[1];
                String item = data[2] + " " + data[3];
                double price = Double.parseDouble(data[4]);
                int quantity = Integer.parseInt(data[5]);
                Fastfood fastfood = new Fastfood(restaurant, item, price, quantity);
                fastfoods.add(fastfood);
                totalCost += price * quantity;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        for (Fastfood food : fastfoods) {
            System.out.println(food.getRestuarantName() + " " + food.getFoodName() + " " + food.getPrice() + " " + food.getQuanity());
        }

        System.out.println("Total cost is " + totalCost);
    }
}
