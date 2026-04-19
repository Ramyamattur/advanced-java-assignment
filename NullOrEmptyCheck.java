//Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
package string;

import java.util.Scanner;

public class NullOrEmptyCheck {

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("String is null or contains only whitespace.");
        } else {
            System.out.println("String is valid.");
        }

        sc.close();
    }
}