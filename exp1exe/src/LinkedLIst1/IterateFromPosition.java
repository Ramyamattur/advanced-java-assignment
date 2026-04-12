package LinkedLIst1;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateFromPosition {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> listobj = new LinkedList<>();

        // Add elements
        listobj.add("Red");
        listobj.add("Blue");
        listobj.add("Green");
        listobj.add("Yellow");

        // Create iterator starting from index 1 (2nd position)
        Iterator<String> iteratorobj = listobj.listIterator(1);

        // Traverse elements from 2nd position
        System.out.println("Elements from 2nd position:");
        while (iteratorobj.hasNext()) {
            System.out.println(iteratorobj.next());
        }
    }
}