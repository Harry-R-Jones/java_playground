package challenges.Week2;

import challenges.Week2.ArrayMerge.ArrayMerge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayMergeTest {

    @Test
    public void mergeTest(){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] mergedArrs = {1,2,3,4,5,6};

        assertArrayEquals(mergedArrs, ArrayMerge.mergeTwoArrays(arr1,arr2));
    }

    @Test
    public void ascendingOrderTest(){
        int[] sortedArrs = {1,2,3,4,5,6};
        int[] unsortedArrs = {6,4,3,5,1,2};
        assertArrayEquals(sortedArrs, ArrayMerge.sortAscending(unsortedArrs));
    }

    @Test
    public void descendingOrderTest(){
        int[] sortedArrs = {6,5,4,3,2,1};
        int[] unsortedArrs = {6,4,3,5,1,2};
        assertArrayEquals(sortedArrs, ArrayMerge.sortDescending(unsortedArrs));
    }
    
    @Test
    public void removeDuplicateTest(){
        int[] duplicatedArrs = {6,4,4,3,0,5,2,3,5,1,2};
        int[] unduplicatedArrs = {6,4,3,0,5,2,1};
        assertArrayEquals(unduplicatedArrs, ArrayMerge.removeDuplicates(duplicatedArrs));
    }
}
