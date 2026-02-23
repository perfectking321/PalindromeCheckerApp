import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String text = "madam";
        Stack<Character> st = new Stack<>();
        for(char c: text.toCharArray()){
            st.push(c);
        }
        boolean isPalin = true;
        for(char c:text.toCharArray()){
            if(c!=st.pop()){
                isPalin=false;
                break;
            }
        }
        System.out.print(text+"is a palindrome?:"+isPalin);
    }
}







