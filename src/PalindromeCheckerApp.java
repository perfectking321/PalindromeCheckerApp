import java.util.Stack;
import java.util.LinkedList;
import java.util.Deque;

public class UseCase13PalindromeCheckerApp {

    static String normalize(String word) {
        return word.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    static boolean stackCheck(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);
        for (char c : word.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    static boolean dequeCheck(String word) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : word.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    static boolean recursiveCheck(String word, int start, int end) {
        if (start >= end) return true;
        if (word.charAt(start) != word.charAt(end)) return false;
        return recursiveCheck(word, start + 1, end - 1);
    }

    static boolean twoPointerCheck(String word) {
        int start = 0, end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";
        String normalized = normalize(word);

        long start, end;

        System.out.println("Word: " + word);
        System.out.println("Normalized: " + normalized);
        System.out.println("--------------------------------------------");

        start = System.nanoTime();
        boolean r1 = stackCheck(normalized);
        end = System.nanoTime();
        System.out.println("Stack Approach      : " + r1 + " | Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean r2 = dequeCheck(normalized);
        end = System.nanoTime();
        System.out.println("Deque Approach      : " + r2 + " | Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean r3 = recursiveCheck(normalized, 0, normalized.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive Approach  : " + r3 + " | Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean r4 = twoPointerCheck(normalized);
        end = System.nanoTime();
        System.out.println("Two Pointer Approach: " + r4 + " | Time: " + (end - start) + " ns");
    }
}