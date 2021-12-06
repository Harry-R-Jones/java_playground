package challenges.Week2.ArrayMerge;

import challenges.Week2.BubbleSort.BubbleSort;

public class ArrayMerge {
//    Given two arrays you must merge those arrays and return them
//    Return the array in Ascending order
//    Return the array in descending order
//    Remove duplicates (Utilising a collection to do this is acceptable)

    public static int[] mergeTwoArrays(int[] arr1, int[] arr2){
        int totalSize = arr1.length + arr2.length;
        int[] mergedArr = new int[totalSize];

        for(int i = 0; i < arr1.length; i++){
            mergedArr[i] = arr1[i];
        }

        for(int j = 0; j < arr2.length; j++){
            mergedArr[arr1.length + j] = arr2[j];
        }

        return mergedArr;
    }

    public static int[] sortAscending(int[] unsortedInts){
        return BubbleSort.bubbleSort(unsortedInts);
    }

    public static int[] sortDescending(int[] unsortedInts){
        return reverseOrder(sortAscending(unsortedInts));
    }

    public static int[] reverseOrder(int[] oldOrder){
        int[] newOrder = new int[oldOrder.length];
        int counter = newOrder.length-1;
        for (int i = 0; i < oldOrder.length; i++) {
            newOrder[i] = oldOrder[counter];
            counter--;
        }
        return newOrder;
    }

    public static int[] removeDuplicates(){
        return null;
    }


}
