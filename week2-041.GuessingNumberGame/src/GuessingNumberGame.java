
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberofguesses=1;
        while (true){
        System.out.println("Guess a number: ");
        int guess=Integer.parseInt(reader.nextLine());
        if (guess<numberDrawn){
            System.out.println("The number is greater, guesses made: "+numberofguesses);
            numberofguesses++;
        }
        else if (guess>numberDrawn){
            System.out.println("The number is lesser, guesses made: "+numberofguesses);
            numberofguesses++;
        }
        else{
            System.out.println("Congratulations, your guess is correct!");
            break;
        }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
