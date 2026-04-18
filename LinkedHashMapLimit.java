package LInkedMap1;
import java.util.*;

public class LinkedHashMapLimit {
    public static void main(String[] args) {

        // Create LinkedHashMap with limit
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>() {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 4; // Keep only 4 elements
            }
        };

        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        // Iterate
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}