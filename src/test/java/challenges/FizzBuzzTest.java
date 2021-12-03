package challenges;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import challenges.Week1.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz(16);

    @Test
    public void fizzTest(){
        String[] testArr = {"FizzBuzz","1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        assertArrayEquals(fizzBuzz.fizzBuzz(), testArr);

    }
}
