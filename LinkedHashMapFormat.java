package LinkedMap3;
import java.util.*;

public class LinkedHashMapFormat {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Java", 1995);
        map.put("Python", 1991);
        map.put("JavaScript", 1995);
        map.put("C++", 1985);

        // Print in required format
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " was developed in " + entry.getValue());
        }
    }
}