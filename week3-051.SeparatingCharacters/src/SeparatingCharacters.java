
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        for(int i=0;i<name.length();i++){
            int j= i+1;
            System.out.println(j+". character: "+name.charAt(i));
            
    }
    }
}
