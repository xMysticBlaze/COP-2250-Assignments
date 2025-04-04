package Wassid10;
import java.util.ArrayList;

public class Meal {
    private ArrayList<Fastfood> meal;

    public Meal() {
        meal = new ArrayList<>();
    }

    public boolean add(Fastfood fastfood) {
        return meal.add(fastfood);
    }

    public Fastfood get(int position) {
        if (position >= 0 && position < meal.size()) {
            return meal.get(position);
        }
        return null;
    }

    public ArrayList<Fastfood> list() {
        return new ArrayList<>(meal);
    }

    public ArrayList<Fastfood> listByPrice(double floor, double ceiling) {
        ArrayList<Fastfood> result = new ArrayList<>();
        for (Fastfood fastfood : meal) {
            if (fastfood.getPrice() >= floor && fastfood.getPrice() <= ceiling) {
                result.add(fastfood);
            }
        }
        return result;
    }

    public ArrayList<Fastfood> sortByQuantity() {
        meal.sort((f1, f2) -> Integer.compare(f1.getQuanity(), f2.getQuanity()));
        return new ArrayList<>(meal);
    }

    public int size() {
        return meal.size();
    }

    public Fastfood findRestaurant(String name) {
        for (Fastfood fastfood : meal) {
            if (fastfood.getRestuarantName().equalsIgnoreCase(name.trim())) {
                return fastfood;
            }
        }
        return null;
    }
}
