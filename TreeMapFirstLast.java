package TreeMap4;
import java.util.*;

public class TreeMapFirstLast {
    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();

        map.put("C2", "Red");
        map.put("C1", "Green");
        map.put("C4", "Black");
        map.put("C3", "White");

        // Get first and last key
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
    }
}