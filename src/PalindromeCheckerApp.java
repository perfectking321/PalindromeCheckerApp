import java.util.LinkedList;
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String text = "civic";
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        for(char c: text.toCharArray()){
            st.push(c);
            q.add(c);
        }
        boolean isPalin = true;
        for(char c:text.toCharArray()){
            if(q.remove()!=st.pop()){
                isPalin=false;
                break;
            }
        }
        System.out.print(text+" is a palindrome?:"+isPalin);
    }
}







