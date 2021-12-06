package challenges.Week2.BubbleSort;

public class BubbleSort {

    public static int[] bubbleSort(int[] unsortedInts){

        for(int i = 0; i < unsortedInts.length - 1; i++){
            for(int j = 0; j < unsortedInts.length - 1; j++){
                if(unsortedInts[j] > unsortedInts[j+1]){
                    int holder = unsortedInts[j];
                    unsortedInts[j] = unsortedInts[j + 1];
                    unsortedInts[j + 1] = holder;
                }
            }
        }

        return unsortedInts;

    }

}
