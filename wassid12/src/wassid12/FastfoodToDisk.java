package wassid12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FastfoodToDisk {

    public static void main(String[] args) throws IOException {

        Fastfood ff1 = new Fastfood("McDonalds  ", "Big Mac      ", 3.99, 2);
        Fastfood ff2 = new Fastfood("Burger King", "Whopper      ", 3.43, 1);
        Fastfood ff3 = new Fastfood("Wendy's    ", "Single Cheese", 2.99, 4);
        Fastfood ff4 = new Fastfood("chick-fil-a", "Spicy Deluxe ", 2.49, 2);
        Fastfood ff5 = new Fastfood("Taco Bell  ", "Crunchwrap   ", 3.99, 1);
        Fastfood ff6 = new Fastfood("Subway     ", "Turkey Sub   ", 4.49, 3);
        Fastfood ff7 = new Fastfood("KFC        ", "Zinger Burger", 4.99, 1);
        Fastfood ff8 = new Fastfood("Pizza Hut  ", "Pepperoni Piz", 8.99, 2);

        // Store the eight fast foods in an arraylist
        ArrayList<Fastfood> fastfoods = new ArrayList<>();
        fastfoods.add(ff1);
        fastfoods.add(ff2);
        fastfoods.add(ff3);
        fastfoods.add(ff4);
        fastfoods.add(ff5);
        fastfoods.add(ff6);
        fastfoods.add(ff7);
        fastfoods.add(ff8);

        // Write the arrayList to disk
        try (FileWriter fileWriter = new FileWriter("fastfood.txt");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            for (Fastfood food : fastfoods) {
                printWriter.println(food.getRestuarantName().trim() + " " +
                                    food.getFoodName().trim() + " " +
                                    food.getPrice() + " " +
                                    food.getQuanity());
            }
        }

        System.out.println("End of Program");
    }
}
