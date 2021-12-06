package challenges.Week2.BubbleSort;

public class BubbleSort {

    /**
     * method to sort an unordered array of ints
     * @param unsortedInts the ints to be sorted
     * @return int[] the sorted array of ints
     */
    public static int[] bubbleSort(int[] unsortedInts) {

        //Assume the array begins unsorted
        boolean sorted = false;

        int its = 0;

        //until sorted
        while (!sorted) {

            //No changes have been made on this pass
            boolean changes = false;

            //for each integer
            for (int j = 0; j < unsortedInts.length - 1; j++) {
                its++;
                //compare with next integer
                if (unsortedInts[j] > unsortedInts[j + 1]) {
                    //if current is larger

                    //Swap the two ints
                    int holder = unsortedInts[j];
                    unsortedInts[j] = unsortedInts[j + 1];
                    unsortedInts[j + 1] = holder;

                    //Update to reflect that changes have been made this pass
                    changes = true;
                }

            }

            //if no changes were made to the array on this pass
            if (!changes) {
                //The array has been sorted
                sorted = true;
            }
        }

        System.out.println(its);
        //return the sorted array
        return unsortedInts;
    }



}
