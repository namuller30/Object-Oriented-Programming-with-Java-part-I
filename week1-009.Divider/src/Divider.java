
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numbera = Integer.parseInt(reader.nextLine());
        System.out.println("Enter another number: ");
        int numberb = Integer.parseInt(reader.nextLine());
        
        double c = numbera/(double)numberb;
        System.out.println("Division: "+numbera+" / "+numberb+" = "+c);
        // Implement your program here. Remember to ask the input from user.
    }
}
