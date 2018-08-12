
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());
        if (grade<=29){
            System.out.println("failed");
        }
        else if (30 <= grade && grade <= 34){
            System.out.println("1");
        }
        else if (35 <= grade && grade <= 39){
            System.out.println("2");
        }
        else if (40 <= grade && grade <= 44){
            System.out.println("3");
        }
        else if (45 <= grade && grade <= 49){
            System.out.println("4");
        }
        else if (50 <= grade && grade <= 60){
            System.out.println("5");
        }
}
}
