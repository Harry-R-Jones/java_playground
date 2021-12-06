package challenges.Week2.BubbleSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    public void bubbleSortTest(){
        int[] jumbledInts = {999,21,352,1,1,8};
        int[] sortedInts = {1,1,8,21,352,999};
        assertArrayEquals(sortedInts, BubbleSort.bubbleSort(jumbledInts));
    }
}
