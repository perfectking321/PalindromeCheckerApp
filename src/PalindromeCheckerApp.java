import java.util.LinkedList;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "wow";
        Deque<Character> deque = new LinkedList();

        for(int i = 0; i < word.length(); ++i) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        while(deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}







