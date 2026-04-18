package Strings;

import java.util.*;

public class StringInterviewSolutions {

    public static void main(String[] args) {

        // ================= 1. PALINDROME =================
        System.out.println("1. Palindrome Check:");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println();

        // ================= 2. COUNT VOWELS =================
        System.out.println("2. Count Vowels:");
        System.out.println(countVowels("Hello World")); // 3
        System.out.println(countVowels("Programming Interview")); // 6
        System.out.println();

        // ================= 3. JOIN STRINGS =================
        System.out.println("3. Custom Join:");
        System.out.println(joinStrings(new String[]{"apple", "banana", "cherry"}, ", "));
        System.out.println(joinStrings(new String[]{"Java", "is", "fun"}, "-"));
        System.out.println();

        // ================= 4. ALTERNATE CHARACTERS =================
        System.out.println("4. Alternate Characters:");
        System.out.println(alternateCharacters("abc", "123"));
        System.out.println(alternateCharacters("hello", "world!"));
        System.out.println();

        // ================= 5. LONGEST SUBSTRING =================
        System.out.println("5. Longest Substring Without Repeating Characters:");
        System.out.println(longestSubstringWithoutRepeating("abcabcbb"));
        System.out.println(longestSubstringWithoutRepeating("bbbbb"));
        System.out.println(longestSubstringWithoutRepeating("pwwkew"));
        System.out.println();

        // ================= 6. FIRST NON-REPEATED =================
        System.out.println("6. First Non-Repeated Character:");
        System.out.println(firstNonRepeatedCharacter("swiss")); // w
        System.out.println(firstNonRepeatedCharacter("aabb")); // null
        System.out.println();

        // ================= 7. REVERSE WORDS =================
        System.out.println("7. Reverse Words:");
        System.out.println(reverseWords("Java programming is fun"));
        System.out.println(reverseWords("Hello World"));
        System.out.println();

        // ================= 8. REMOVE CHARACTER =================
        System.out.println("8. Remove Character:");
        System.out.println(removeCharacter("programming", 'm'));
        System.out.println(removeCharacter("banana", 'a'));
        System.out.println();

        // ================= 9. GENERATE SUBSTRINGS =================
        System.out.println("9. Generate All Substrings:");
        System.out.println(generateSubstrings("abc"));
        System.out.println(generateSubstrings("xy"));
        System.out.println();

        // ================= 10. INSERT SPACE =================
        System.out.println("10. Insert Space After N Characters:");
        System.out.println(insertSpaceAfterNChars("ABCDEFGHIJKLMNOPQR", 4));
        System.out.println(insertSpaceAfterNChars("programming", 3));
    }

    // ==========================================================
    // 1. Check Palindrome (ignore case & special characters)
    // ==========================================================
    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        int left = 0, right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            // Compare ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;

            left++;
            right--;
        }
        return true;
    }

    // ==========================================================
    // 2. Count vowels
    // ==========================================================
    public static int countVowels(String s) {
        if (s == null) return 0;

        int count = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // ==========================================================
    // 3. Join strings using delimiter
    // ==========================================================
    public static String joinStrings(String[] arr, String delimiter) {
        if (arr == null || arr.length == 0) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);

            if (i < arr.length - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }

    // ==========================================================
    // 4. Alternate characters
    // ==========================================================
    public static String alternateCharacters(String s1, String s2) {
        if (s1 == null) s1 = "";
        if (s2 == null) s2 = "";

        StringBuilder result = new StringBuilder();

        int max = Math.max(s1.length(), s2.length());

        for (int i = 0; i < max; i++) {
            if (i < s1.length()) result.append(s1.charAt(i));
            if (i < s2.length()) result.append(s2.charAt(i));
        }

        return result.toString();
    }

    // ==========================================================
    // 5. Longest substring without repeating characters
    // ==========================================================
    public static String longestSubstringWithoutRepeating(String s) {

        if (s == null || s.isEmpty()) return "";

        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0, maxLen = 0, maxStart = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1;
            }

            if (i - start + 1 > maxLen) {
                maxLen = i - start + 1;
                maxStart = start;
            }

            map.put(c, i);
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    // ==========================================================
    // 6. First non-repeated character
    // ==========================================================
    public static Character firstNonRepeatedCharacter(String s) {

        if (s == null || s.isEmpty()) return null;

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first unique
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    // ==========================================================
    // 7. Reverse each word
    // ==========================================================
    public static String reverseWords(String s) {

        if (s == null || s.isEmpty()) return "";

        String[] words = s.split(" ");
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < words.length; i++) {

            StringBuffer temp = new StringBuffer(words[i]);
            result.append(temp.reverse());

            if (i < words.length - 1) result.append(" ");
        }

        return result.toString();
    }

    // ==========================================================
    // 8. Remove character
    // ==========================================================
    public static String removeCharacter(String s, char ch) {

        if (s == null) return null;

        StringBuffer buffer = new StringBuffer(s);
        int i = 0;

        while (i < buffer.length()) {
            if (buffer.charAt(i) == ch) {
                buffer.deleteCharAt(i);
            } else {
                i++;
            }
        }
        return buffer.toString();
    }

    // ==========================================================
    // 9. Generate substrings
    // ==========================================================
    public static List<String> generateSubstrings(String s) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                temp.append(s.charAt(j));
                list.add(temp.toString());
            }
        }
        return list;
    }

    // ==========================================================
    // 10. Insert space after N characters
    // ==========================================================
    public static String insertSpaceAfterNChars(String s, int n) {

        if (s == null || n <= 0) return s;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));

            if ((i + 1) % n == 0 && i < s.length() - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}