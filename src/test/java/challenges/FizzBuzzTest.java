package challenges;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import challenges.Week1.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    //Create a FizzBuzz up to a limit
    FizzBuzz fizzBuzz = new FizzBuzz(500);

    @Test
    public void fizzTest(){
        //String[] testArr = {"FizzBuzz","1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        assertEquals("Buzz", fizzBuzz.fizzBuzz()[400]);
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz()[150]);

    }
}
