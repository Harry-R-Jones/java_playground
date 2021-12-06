package challenges.Week2.palindrome_word_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeCheckerTest {
    PalindromeChecker pC = new PalindromeChecker();

    @Test
    public void palindromeWordTest(){
        assertEquals(true, pC.isPalindromic("f"));
        assertEquals(true, pC.isPalindromic("makam"));
        assertEquals(true, pC.isPalindromic("racecar"));
        assertEquals(true, pC.isPalindromic("1oho1"));
        assertEquals(true, pC.isPalindromic(""));
    }
}
