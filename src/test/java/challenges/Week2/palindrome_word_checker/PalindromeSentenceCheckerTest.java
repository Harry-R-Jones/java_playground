package challenges.Week2.palindrome_word_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeSentenceCheckerTest {

    @Test
    public void palindromeSentenceCheckerTest(){
        assertEquals(4, PalindromeSentenceChecker.checkPalindromesInSentence("makam a racecar lol"));
    }

}
