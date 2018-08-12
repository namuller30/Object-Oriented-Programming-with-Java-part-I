
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String reversestring="";
        for (int i=1;i<text.length()+1;i++){
            reversestring+=text.charAt(text.length()-i);
        }
        return reversestring;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
