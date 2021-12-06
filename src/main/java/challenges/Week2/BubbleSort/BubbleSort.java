package challenges.Week2.BubbleSort;

public class BubbleSort {

    public static int[] bubbleSort(int[] unsortedInts) {
        boolean sorted = false;

        while (!sorted) {
            boolean changes = false;
            for (int j = 0; j < unsortedInts.length - 1; j++) {
                if (unsortedInts[j] > unsortedInts[j + 1]) {
                    int holder = unsortedInts[j];
                    unsortedInts[j] = unsortedInts[j + 1];
                    unsortedInts[j + 1] = holder;
                    changes = true;
                }
            }
            if (!changes) {
                sorted = true;
            }
        }
        return unsortedInts;
    }



}
