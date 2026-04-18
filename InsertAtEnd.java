package LinkedList3;
import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");

        // Insert element at the end using offerLast()
        list.offerLast("Pink");

        // Display list
        System.out.println("After inserting at end: " + list);
    }
}