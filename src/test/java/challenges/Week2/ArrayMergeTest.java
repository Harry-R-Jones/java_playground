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
}