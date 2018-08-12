
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String guess = "";
        while (!(guess.equals(password))){
            System.out.println("Type the Password: ");
            guess = reader.nextLine();
            if (guess.equals(password)){
                System.out.println("Right!");
            }
            else{
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: jryy qbar!");
        
        // Write your code here
    }
}
