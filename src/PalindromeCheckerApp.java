public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        String word = "racecar";

        Node head = null, tail = null;

        for (int i = 0; i < word.length(); i++) {
            Node node = new Node(word.charAt(i));
            if (head == null) { head = node; tail = node; }
            else { tail.next = node; tail = node; }
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null, curr = slow;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head, right = prev;
        boolean isPalindrome = true;
        while (right != null) {
            if (left.data != right.data) { isPalindrome = false; break; }
            left = left.next;
            right = right.next;
        }

        if (isPalindrome) System.out.println(word + " is a Palindrome");
        else System.out.println(word + " is NOT a Palindrome");
    }
}