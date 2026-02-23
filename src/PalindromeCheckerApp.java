public class PalindromeCheckerApp {
    public static void main(String[] args){
        String text = "madam";
        char[] chars = text.toCharArray();
        int start=0,end=chars.length-1;
        boolean isPalin = true;
        while(start<end){
            if(chars[start]==chars[end]){
                start++;
                end--;
            }
            else {
                isPalin = false;
                break;
            }
        }
        System.out.println(text+" is palindrome: "+isPalin);
    }
}







