import java.util.Stack;

class PalindromeChecker {

    private String normalize(String word) {
        return word.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    private boolean check(String word, int start, int end) {
        if (start >= end) return true;
        if (word.charAt(start) != word.charAt(end)) return false;
        return check(word, start + 1, end - 1);
    }

    public boolean checkPalindrome(String word) {
        String normalized = normalize(word);
        return check(normalized, 0, normalized.length() - 1);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        String word = "A man a plan a canal Panama";

        if (checker.checkPalindrome(word))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");
    }
}