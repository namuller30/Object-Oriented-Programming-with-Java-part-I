
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = Integer.parseInt(reader.nextLine()); 
        System.out.println("Enter another number: ");
        int y = Integer.parseInt(reader.nextLine()); 
        int total = x+y;
        System.out.println("");
        System.out.println("Sum of the numbers: "+total);
        // Implement your program here. Remember to ask the input from user
    }
}
