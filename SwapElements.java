//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))
package LinkedList5;
import java.util.*;

public class SwapElements {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Swap elements at index 0 and 2
        Collections.swap(list, 0, 2);

        // Display result
        System.out.println("After swapping: " + list);
    }
}