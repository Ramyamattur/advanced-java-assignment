package HashMap4;
import java.util.*;

public class HashMapCheckEmpty {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        // Check if empty
        System.out.println("Is map empty? " + map.isEmpty());

        // Remove all elements
        map.clear();

        // Check again
        System.out.println("Is map empty after clear? " + map.isEmpty());
    }
}