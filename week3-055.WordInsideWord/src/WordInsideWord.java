
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String firstword=reader.nextLine();
        System.out.println("Type the second word: ");
        String secondword=reader.nextLine();
        int indexreturn=indexer(firstword,secondword);
        if (indexreturn==-1){
            System.out.println("The word '"+secondword+"' is not found in the word '"+firstword+"'.");
        }
        else{
            System.out.println("The word '"+secondword+"' is found in the word '"+firstword+"'.");
        }
    }
    public static int indexer(String firstword, String secondword){
        int index = firstword.indexOf(secondword);
        return index;
    }
}
