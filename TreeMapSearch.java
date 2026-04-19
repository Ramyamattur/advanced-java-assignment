package TreeMap2;
import java.util.*;

public class TreeMapSearch {
    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();

        // Add elements
        map.put("C1", "Red");
        map.put("C2", "Green");
        map.put("C3", "Black");
        map.put("C4", "White");

        // Check keys
        System.out.println("Contains C4? " + map.containsKey("C4"));
        System.out.println("Contains C5? " + map.containsKey("C5"));
    }
}