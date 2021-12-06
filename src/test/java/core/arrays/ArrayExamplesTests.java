package core.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayExamplesTests {
    ArrayExamples arrayExamples = new ArrayExamples();

    @Test
    public void swapTest(){
        int[] dummy = {1,2,5,4,3};
        assertArrayEquals(dummy, arrayExamples.swapItems(3,5));
    }
}
