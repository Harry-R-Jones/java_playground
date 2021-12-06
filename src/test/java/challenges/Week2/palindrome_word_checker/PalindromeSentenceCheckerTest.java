package challenges.Week2.palindrome_word_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeSentenceCheckerTest {
    PalindromeSentenceChecker pcsc = new PalindromeSentenceChecker();

    @Test
    public void palindromeSentenceCheckerTest(){
        pcsc.setSentence("makam a racecar lol");
        assertEquals(4, pcsc.checkPalindromesInSentence());
    }

}
