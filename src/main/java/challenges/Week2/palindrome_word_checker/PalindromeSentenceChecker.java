package challenges.Week2.palindrome_word_checker;

import java.util.ArrayList;
import java.util.Iterator;

public class PalindromeSentenceChecker {
    static ArrayList<String> sentenceList = new ArrayList<>();

    public PalindromeSentenceChecker() {

    }

    public static void setSentence(String sentence){
        int placeCounter = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                sentenceList.add(sentence.substring(placeCounter, i));
                placeCounter = i + 1;
            }
        }
        sentenceList.add(sentence.substring(placeCounter));
    }

    public static int checkPalindromesInSentence(String sentence){
        int palindromes = 0;
        setSentence(sentence);
//        PalindromeChecker pc = new PalindromeChecker();

        for (String word: sentenceList) {
            if(PalindromeChecker.isPalindromic(word)){
                palindromes++;
            }
        }

        return palindromes;
    }
}
