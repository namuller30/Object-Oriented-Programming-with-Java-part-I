
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String firstname = reader.nextLine();
        System.out.println("Type your age: ");
        int firstage = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String secondname = reader.nextLine();
        System.out.println("Type your age: ");
        int secondage = Integer.parseInt(reader.nextLine());
        
        int totalage= firstage+secondage;
        System.out.println(firstname+" and "+ secondname+" are " + totalage+" years old in total.");
        // Implement your program here
    }
}
