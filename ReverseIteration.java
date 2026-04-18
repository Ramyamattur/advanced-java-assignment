package LinkedList2;
import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // Use descendingIterator() for reverse traversal
        Iterator<String> itr = list.descendingIterator();

        // Print elements in reverse order
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}