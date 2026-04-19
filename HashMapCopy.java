package HashMap3;
import java.util.*;

public class HashMapCopy {
    public static void main(String[] args) {

        // First map
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");

        // Second map
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");

        // Copy all mappings from map1 to map2
        map2.putAll(map1);

        // Display result
        System.out.println("After copying: " + map2);
    }
}