public class PalindromeCheckerApp {
    public static void main(String[] args){
        String text = "madam";
        boolean isPalin = true;
        System.out.println("Input text: "+ text);
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                isPalin = false;
                break;
            }
        }
        if(isPalin) System.out.println("Is it a Palindrome? : True");
        else System.out.println("Is it a Palindrome? : False");
    }
}





