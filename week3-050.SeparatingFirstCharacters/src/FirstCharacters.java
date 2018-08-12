import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        if (name.length()>3){
            char charone = name.charAt(0);
            char chartwo = name.charAt(1);
            char charthree = name.charAt(2);
            System.out.println("1. Character: "+charone);
            System.out.println("2. Character: "+chartwo);
            System.out.println("3. Character: "+charthree);
            
        }
    }
}
