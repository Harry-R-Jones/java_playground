package challenges.Week1.FizzBuzz;

public class FizzBuzz {
    /*
        Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
        “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.
     */
    int upperLimit;


    public FizzBuzz(int limit) {
        this.upperLimit = limit;
    }

    public boolean divisibleBy(int testSubject, int divider){
        boolean isDivisible = false;
        if(testSubject % divider == 0){
            isDivisible = true;
        }
        return isDivisible;
    }

    public String[] fizzBuzz(){
        String[] finalArray = new String[upperLimit];
        String outString;
        for(int i = 0; i < upperLimit; i++){
            outString = "";

            if(divisibleBy(i, 3)){
                outString = outString + "Fizz";
            }

            if(divisibleBy(i, 5)){
                outString = outString + "Buzz";
            }

            if(outString.equals("")){
                outString = outString + i;
            }

            finalArray[i] = outString;
        }

        return finalArray;
    }
}
