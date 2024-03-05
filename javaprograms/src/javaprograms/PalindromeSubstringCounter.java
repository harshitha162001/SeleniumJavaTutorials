package javaprograms;

import java.util.HashSet;

public class PalindromeSubstringCounter {

    public static int countPalindromeSubstrings(String s) {
        int n = s.length();
        HashSet<String> palindromeSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            expandFromCenter(s, i, i, palindromeSet);       // Odd length palindrome
            expandFromCenter(s, i, i + 1, palindromeSet);   // Even length palindrome
        }

        // Print all palindrome substrings (optional)
        System.out.println("Palindrome Substrings: " + palindromeSet);

        return palindromeSet.size();
    }

    private static void expandFromCenter(String s, int left, int right, HashSet<String> palindromeSet) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            palindromeSet.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String input = "assa";
        int result = countPalindromeSubstrings(input);
        System.out.println("Number of palindrome substrings: " + result);
    }
}