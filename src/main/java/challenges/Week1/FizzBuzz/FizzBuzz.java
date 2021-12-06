package challenges.Week1.FizzBuzz;

public class FizzBuzz {
    /*
        Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
        “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.
     */

    //The number at which we will stop
    int upperLimit;

    //Constructor for FizzBuzz
    public FizzBuzz(int limit) {
        this.upperLimit = limit;
    }

    /**
     * Method to check if a number is wholly divisible by another
     * @param testSubject The number to divide
     * @param divider The number to be divided
     * @return isDivisible Whether or not the number is wholly divisible by the other
     */
    public boolean divisibleBy(int testSubject, int divider){

        return (testSubject % divider == 0);
    }

    /**
     * Method to generate the FizzBuzz for numbers up to the class's upperLimit
     * @return String[] The Array of Output Strings
     */
    public String[] fizzBuzz(){
        //Initialise the String Array as the same size as the limit
        String[] finalArray = new String[upperLimit + 1];

        //Initialise the String to store each line
        String outString;

        //Iterate through numbers
        for(int i = 0; i <= upperLimit; i++){

            //Reset outString for each number's line
            outString = "";

            //if divisible by 3, add "Fizz"
            if(divisibleBy(i, 3)){
                outString = outString + "Fizz";
            }

            //if divisible by 5, add "Buzz"
            if(divisibleBy(i, 5)){
                outString = outString + "Buzz";
            }

            //if neither then add the number
            if(outString.equals("")){
                outString = outString + i;
            }

            //Add this line as an element of the array
            finalArray[i] = outString;
        }

        return finalArray;
    }
}
