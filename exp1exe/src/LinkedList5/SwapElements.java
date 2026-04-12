package LinkedList5;
import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> l_list = new LinkedList<>();

        // Add elements
        l_list.add("Red");
        l_list.add("Blue");
        l_list.add("Green");
        l_list.add("Yellow");

        // Swap 1st (index 0) and 3rd (index 2) elements
        Collections.swap(l_list, 0, 2);

        // Display updated list
        System.out.println("After swapping: " + l_list);
    }
}