import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what? ");
        int max = Integer.parseInt(reader.nextLine());
        int looper=1;
        int sum=1;
        while (looper<=max){
            sum*=looper;
            looper++;
        }
        System.out.println("Sum is "+sum);
    }
}
