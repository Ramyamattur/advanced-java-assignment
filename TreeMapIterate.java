package TreeMap1;
import java.util.*;

public class TreeMapIterate {
    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements
        treeMap.put(1, "Apple");
        treeMap.put(2, "Strawberry");
        treeMap.put(3, "Pear");
        treeMap.put(4, "Cucumber");
        treeMap.put(5, "Grapes");

        // Iterate entries
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}