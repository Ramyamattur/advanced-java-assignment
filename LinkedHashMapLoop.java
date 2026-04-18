package LinkedMap4;
import java.util.*;

public class LinkedHashMapLoop {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Arrays
        String[] keys = {"C", "A", "B", "E", "D"};
        Integer[] values = {3, 1, 2, 5, 4};

        // Insert using loop
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        // Display map
        System.out.println(map);
    }
}