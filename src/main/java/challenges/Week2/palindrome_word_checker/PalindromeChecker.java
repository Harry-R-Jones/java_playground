package challenges.Week2.palindrome_word_checker;

public class PalindromeChecker {

    public PalindromeChecker() {

    }

    public boolean isPalindromic(String palindromeCandidate){
        boolean isPalindrome = true;
        while(palindromeCandidate.length() > 1){
            if(palindromeCandidate.charAt(0) == palindromeCandidate.charAt(palindromeCandidate.length()-1)){
                palindromeCandidate = palindromeCandidate.substring(1, palindromeCandidate.length()-1);
            } else {
                isPalindrome = false;
                palindromeCandidate = palindromeCandidate.substring(1, palindromeCandidate.length()-1);
            }
        }

        return isPalindrome;
    }

//    public static void main(String[] args) {
//        PalindromeChecker pC = new PalindromeChecker("makam");
//        if(pC.isPalindromic()){
//            System.out.println("True");
//        } else{
//            System.out.println("False");
//        }
//    }
}
