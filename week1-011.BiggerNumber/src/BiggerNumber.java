
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int firstnumb = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int secondnumb = Integer.parseInt(reader.nextLine());
        if (firstnumb>secondnumb){
            System.out.println("The bigger of the two numbers given was: "+firstnumb);
        }
        else {
            System.out.println("The bigger of the two numbers given was: "+secondnumb);
        }
        // Implement your program here. Remember to ask the input from user
    }
}
