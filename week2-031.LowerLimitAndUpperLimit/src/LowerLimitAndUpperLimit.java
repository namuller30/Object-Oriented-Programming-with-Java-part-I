
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int looper = Integer.parseInt(reader.nextLine());
        
        while (looper>=number){
            System.out.println(number);
            number++;
        }
        // write your code here

    }
}
