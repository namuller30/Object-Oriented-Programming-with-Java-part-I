import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        int average;
        boolean greater;
        
        instructions(lowerLimit, upperLimit);
        int maxUpper=upperLimit;
        int midUpper=upperLimit/2;
        while (true){
                if (lowerLimit==upperLimit) {
                System.out.println("The number you're thinking of is " + upperLimit + ".");
                break;
            }

            average = this.average(lowerLimit, upperLimit);   // get average of lower and upper
            greater = this.isGreaterThan(average);    // is searchedFor larger than average?

            if (greater) {
                lowerLimit = average+1;
            } else {
                upperLimit = average;
            }
        
        
        
        

    }
    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }
    
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than "+value+" (y/n)?");
        String input=this.reader.nextLine();
        if (input.equals("y")){
            return true;
        }
        else {
            return false;
        }
    }
    
    public int average(int firstNumber, int secondNumber){
        int average = (firstNumber+secondNumber)/2;
        return average;
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
