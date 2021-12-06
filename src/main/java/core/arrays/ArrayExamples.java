package core.arrays;

import java.util.ArrayList;

public class ArrayExamples {
    private int[] gameMenuItems = {1, 2, 3, 4, 5};

    public int[] swapItems(int item1, int item2){

        if((verifyNumber(item1)) && (verifyNumber(item2))) {

            int index1= -1, index2 = -1;

            for (int i = 0; i < 5; i++) {
                if (gameMenuItems[i] == item1) {
                    index1 = i;
                }
                if (gameMenuItems[i] == item2) {
                    index2 = i;
                }
            }

            gameMenuItems[index1] = item2;
            gameMenuItems[index2] = item1;
        }

            return gameMenuItems;
    }

    public boolean verifyNumber(int candidateNumber){
        boolean valid = true;

        if(candidateNumber < 0 ||candidateNumber > 5){
            valid = false;
        }

        return valid;
    }



    public void setGameMenuItems(int[] gameMenuItems) {
        this.gameMenuItems = gameMenuItems;
    }
}
