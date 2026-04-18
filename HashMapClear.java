package HashMap2;

import java.util.*;

public class HashMapClear {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        // Clear all elements
        map.clear();

        // Check size
        System.out.println("Size after clear: " + map.size());

        // Add again
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        // Check size again
        System.out.println("Size after adding again: " + map.size());
    }
}