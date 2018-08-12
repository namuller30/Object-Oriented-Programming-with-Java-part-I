import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(name.length()-1-i));
        }
    }
}
