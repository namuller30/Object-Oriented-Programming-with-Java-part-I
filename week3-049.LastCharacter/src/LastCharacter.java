import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char firstchar=lastCharacter(name);
        System.out.println("Last Character: "+firstchar);
    }
    public static char lastCharacter(String name){
        char lastchar=name.charAt(name.length()-1);
        return lastchar;
    }
    
    
}
