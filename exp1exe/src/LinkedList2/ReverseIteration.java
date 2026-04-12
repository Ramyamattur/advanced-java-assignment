package LinkedList2;
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseIteration {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> listobj = new LinkedList<>();

        // Add elements
        listobj.add("Red");
        listobj.add("Blue");
        listobj.add("Green");
        listobj.add("Yellow");

        // Use descendingIterator() for reverse traversal
        Iterator<String> revIterator = listobj.descendingIterator();

        System.out.println("Reverse order:");
        while (revIterator.hasNext()) {
            System.out.println(revIterator.next());
        }
    }
}