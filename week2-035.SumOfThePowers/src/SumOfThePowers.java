
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int maxpower = Integer.parseInt(reader.nextLine());
        int power = 0;
        int total=0;
        while (power<=maxpower){
            total += (int)Math.pow(2,power);
            power++;
        }
        System.out.println("The result is "+total);
    }
}
