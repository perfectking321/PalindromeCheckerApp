import java.util.Stack;
import java.util.LinkedList;
import java.util.Deque;

interface PalindromeStrategy {
    boolean check(String word);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);

        for (char c : word.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : word.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    boolean checkPalindrome(String word) {
        String normalized = word.toLowerCase().replaceAll("[^a-z0-9]", "");
        return strategy.check(normalized);
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";

        PalindromeChecker checker1 = new PalindromeChecker(new StackStrategy());
        PalindromeChecker checker2 = new PalindromeChecker(new DequeStrategy());

        System.out.println("Using Stack Strategy:");
        if (checker1.checkPalindrome(word))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");

        System.out.println("\nUsing Deque Strategy:");
        if (checker2.checkPalindrome(word))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");
    }
}