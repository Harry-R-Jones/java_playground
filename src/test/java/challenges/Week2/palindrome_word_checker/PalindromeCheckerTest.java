package challenges.Week2.palindrome_word_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class  PalindromeCheckerTest {
//    PalindromeChecker pC = new PalindromeChecker();

    @Test
    public void palindromeWordTest(){
        assertTrue(PalindromeChecker.isPalindromic("f"));
        assertTrue(PalindromeChecker.isPalindromic("makam"));
        assertTrue(PalindromeChecker.isPalindromic("racecar"));
        assertTrue(PalindromeChecker.isPalindromic("1oho1"));
        assertTrue(PalindromeChecker.isPalindromic(""));
    }


}
