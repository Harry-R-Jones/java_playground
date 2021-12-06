package challenges.Week2.palindrome_word_checker;

public class PalindromeChecker {
    private String palindromeCandidate;

    public PalindromeChecker(String palindromeCandidate) {
        this.palindromeCandidate = palindromeCandidate;
    }

    public boolean isPalindromic(){
        boolean isPalindrome = true;
        while(palindromeCandidate.length() > 1){
            if(palindromeCandidate.charAt(0) == palindromeCandidate.charAt(palindromeCandidate.length()-1)){
                palindromeCandidate = palindromeCandidate.substring(1, palindromeCandidate.length()-1);
            } else {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        PalindromeChecker pC = new PalindromeChecker("makam");
        if(pC.isPalindromic()){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
