import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLister {
    
    public static void main(String[] args) {
        // Step 1: Create an ArrayList and add five names to it
        ArrayList<String> celebrities = new ArrayList<>();
        celebrities.add("Lionel Messi");
        celebrities.add("Drake");
        celebrities.add("Adele");
        celebrities.add("Dwayne Johnson");
        celebrities.add("Beyonce");

        // Step 2: Display the names using a for loop and get() method
        System.out.println("Here is the list");
        for (int i = 0; i < celebrities.size(); i++) {
            System.out.println(celebrities.get(i));
        }

        // Step 3: Pass the list to a void method that modifies it
        modifyList(celebrities);

        // Step 4: Use a foreach loop to display the modified list with asterisks
        System.out.println("Here is the new list");
        for (String name : celebrities) {
            System.out.print(" * " + name);
        }
        System.out.println(" *");

        // Step 5: Use an iterator to display the modified list again, one name per line
        System.out.println("Using an iterator, here is the list");
        Iterator<String> iterator = celebrities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Method to modify the list
    public static void modifyList(ArrayList<String> list) {
        list.add(2, "Taylor Swift"); // Insert a name at index 2
        list.remove(4); // Remove the name at index 4
    }
}
