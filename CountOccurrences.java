package list2;
public class CountOccurrences {

    // Function to count occurrences
    public static int countOccurrences(String mainStr, String subStr) {

        int count = 0, index = 0;

        // Loop through string
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        return count;
    }

    public static void main(String[] args) {

        String mainStr = "apple banana apple apple";
        String subStr = "apple";

        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }
}