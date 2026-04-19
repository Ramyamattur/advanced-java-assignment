package LinkedMap2;
import java.util.*;

public class LinkedHashMapLanguages {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Java", 1995);
        map.put("Python", 1991);
        map.put("JavaScript", 1995);
        map.put("C++", 1985);

        System.out.println(map);
    }
}