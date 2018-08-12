import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char firstchar=firstCharacter(name);
        System.out.println("First Character: "+firstchar);
    }
    public static char firstCharacter(String name){
        char firstchar=name.charAt(0);
        return firstchar;
    }
}
