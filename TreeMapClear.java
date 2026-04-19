package TreeMap3;

import java.util.*;

public class TreeMapClear {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // Add elements
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        // Clear map
        map.clear();
        System.out.println("Size after clear: " + map.size());

        // Add again
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        // Iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("Size: " + map.size());
    }
}