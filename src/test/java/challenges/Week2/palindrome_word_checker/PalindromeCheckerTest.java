package challenges.Week2.palindrome_word_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  PalindromeCheckerTest {
//    PalindromeChecker pC = new PalindromeChecker();

    @Test
    public void palindromeWordTest(){
        assertEquals(true, PalindromeChecker.isPalindromic("f"));
        assertEquals(true, PalindromeChecker.isPalindromic("makam"));
        assertEquals(true, PalindromeChecker.isPalindromic("racecar"));
        assertEquals(true, PalindromeChecker.isPalindromic("1oho1"));
        assertEquals(true, PalindromeChecker.isPalindromic(""));
    }
}
