
import java.util.Scanner;

public class PrintingOutText {

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
        
    }

    public static void main(String[] args) {
        System.out.println("How many");
        Scanner reader = new Scanner(System.in);
        int input = Integer.parseInt(reader.nextLine());
        for(int i=0; i<=input;i++){
            printText();
        }
        
    }
}
