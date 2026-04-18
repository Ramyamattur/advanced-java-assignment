package LinkedList4;
import java.util.*;

public class DisplayPositions {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Traverse using index
        for (int i = 0; i < list.size(); i++) {

            // Print position and element
            System.out.println("Position " + i + " : " + list.get(i));
        }
    }
}