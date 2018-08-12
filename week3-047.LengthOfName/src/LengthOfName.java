
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int number = calculateCharacters(name);
        System.out.println("Number of characters: "+number);
        
    }
    
    public static int calculateCharacters(String text){
        int charactercount=text.length();
        return charactercount;
    }
    // do here the method
    // public static int calculateCharacters(String text)
    
}
