package src;

public class Palindrome {
    public boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }


    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        boolean result  =palindrome.isPalindrome("deified");
        System.out.println(result);
    }


}
