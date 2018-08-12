import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        String reversestring="";
        for (int i=1;i<text.length()+1;i++){
            reversestring+=text.charAt(text.length()-i);
        }
        return reversestring;
    }
    public static boolean palindrome(String text) {
        String reversestring = reverse(text);
        if (text.equals(reversestring)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
