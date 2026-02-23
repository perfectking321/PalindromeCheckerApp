public class PalindromeCheckerApp {
    public static void main(String[] args){
        String text = "madam";
        String reversed = "";
        System.out.println("Input text: "+ text);
        for(int i=text.length()-1;i>=0;i--){
            reversed += text.charAt(i);
        }
        if(text.equals(reversed)) System.out.println(text+": is a palindrome");
        else System.out.println(text+": is not a palindrome");
    }
}







