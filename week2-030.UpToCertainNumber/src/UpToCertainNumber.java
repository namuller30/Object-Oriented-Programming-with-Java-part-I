
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        int looper=1;
        while (looper<=number){
            System.out.println(looper);
            looper++;
        }
        // Write your code here
        
    }
}
