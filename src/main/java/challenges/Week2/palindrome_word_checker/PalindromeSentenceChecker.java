package challenges.Week2.palindrome_word_checker;

import java.util.ArrayList;
import java.util.Iterator;

public class PalindromeSentenceChecker {
    ArrayList<String> sentenceList = new ArrayList<>();

    public PalindromeSentenceChecker() {

    }

    public void setSentence(String sentence){
        int placeCounter = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                sentenceList.add(sentence.substring(placeCounter, i));
                placeCounter = i + 1;
            }
        }
        sentenceList.add(sentence.substring(placeCounter));
    }

    public int checkPalindromesInSentence(){
        int palindromes = 0, notPalindromes = 0;
        PalindromeChecker pc = new PalindromeChecker();

        for (String word: sentenceList) {
            if(pc.isPalindromic(word)){
                palindromes++;
            }
        }

        return palindromes;
    }
}
