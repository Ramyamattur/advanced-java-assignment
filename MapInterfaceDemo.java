package Collections;

import java.util.*;

public class MapInterfaceDemo {

    public static void main(String[] args) {

        // ================= HASHMAP DEMONSTRATION =================
        System.out.println("=== HashMap Demonstration ===");

        // Create HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // 1. Adding elements
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);
        System.out.println("Initial HashMap: " + hashMap);

        // Updating value
        hashMap.put("Apple", 5); // Updates existing value
        System.out.println("After updating Apple's value: " + hashMap);

        // putIfAbsent() demonstration
        hashMap.putIfAbsent("Apple", 10); // Will NOT update
        hashMap.putIfAbsent("Grape", 4);  // Will add new entry
        System.out.println("After putIfAbsent operations: " + hashMap);

        // 2. Accessing elements
        System.out.println("\nAccessing Elements:");
        System.out.println("Value for Apple: " + hashMap.get("Apple"));
        System.out.println("Value for missing key: " + hashMap.get("Mango"));
        System.out.println("Value with default: " + hashMap.getOrDefault("Mango", 0));

        // 3. Removing elements
        hashMap.remove("Banana");
        System.out.println("After removing Banana: " + hashMap);

        // Conditional remove
        hashMap.remove("Apple", 5);
        System.out.println("After conditional remove: " + hashMap);


        // ================= TREEMAP DEMONSTRATION =================
        System.out.println("\n=== TreeMap Demonstration ===");

        // TreeMap (sorted by keys)
        TreeMap<String, Integer> scores = new TreeMap<>();

        // Adding elements
        scores.put("Alice", 95);
        scores.put("Bob", 82);
        scores.put("Charlie", 90);
        scores.put("David", 78);
        scores.put("Eva", 88);

        // Display sorted map
        System.out.println("TreeMap contents: " + scores);

        // Access element
        System.out.println("Charlie's score: " + scores.get("Charlie"));

        // Remove element
        scores.remove("David");
        System.out.println("After removing David: " + scores);

        // Navigation operations
        System.out.println("First entry: " + scores.firstEntry());
        System.out.println("Last entry: " + scores.lastEntry());

        // Natural ordering example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1);
        treeMap.put("Lion", 2);
        treeMap.put("Elephant", 3);
        System.out.println("Naturally ordered TreeMap: " + treeMap);


        // ================= LINKEDHASHMAP DEMONSTRATION =================
        System.out.println("\n=== LinkedHashMap Demonstration ===");

        // LinkedHashMap with removal of eldest entry
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>() {

            // Override method to remove eldest entry
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > 3;
            }
        };

        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        System.out.println("Initial LinkedHashMap: " + linkedHashMap);

        // Adding new element (removes oldest entry)
        linkedHashMap.put("D", 4);
        System.out.println("After adding D: " + linkedHashMap);


        // ================= ITERATION =================
        System.out.println("\n=== Map Iteration ===");

        // Iterate entries
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Iterate keys
        System.out.println("\nKeys:");
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }

        // Iterate values
        System.out.println("\nValues:");
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }


        // ================= MAP OPERATIONS =================
        System.out.println("\n=== Map Operations ===");

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge maps
        map2.forEach((key, value) ->
                map1.merge(key, value, (v1, v2) -> v1 + v2));

        System.out.println("After merging maps: " + map1);


        // ================= COMPUTE OPERATIONS =================
        System.out.println("\n=== Compute Operations ===");

        map1.compute("A", (k, v) -> (v == null) ? 1 : v * 2);
        System.out.println("After compute A: " + map1);

        map1.computeIfPresent("B", (k, v) -> v * 3);
        System.out.println("After computeIfPresent B: " + map1);

        map1.computeIfAbsent("D", k -> 10);
        System.out.println("After computeIfAbsent D: " + map1);


        // ================= BULK OPERATIONS =================
        System.out.println("\n=== Bulk Operations ===");

        Map<String, Integer> newMap = new HashMap<>();
        newMap.putAll(map1);
        System.out.println("After putAll: " + newMap);

        // Clear map
        newMap.clear();
        System.out.println("After clearing: " + newMap);


        // ================= CHECKING OPERATIONS =================
        System.out.println("\n=== Checking Operations ===");

        System.out.println("Is map empty? " + newMap.isEmpty());
        System.out.println("Map size: " + map1.size());
        System.out.println("Contains key 'A'? " + map1.containsKey("A"));
        System.out.println("Contains value 1? " + map1.containsValue(1));
    }
}