import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int input = 0;
        int sum=0;
        int numbertracker=0;
        int eventracker=0;
        while (input!=-1){
            input=Integer.parseInt(reader.nextLine());
            System.out.println(input);
            if (input!=-1){
                sum+=input;
                numbertracker+=1;
                if (input%2==0){
                    eventracker+=1;
                }
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many number: "+numbertracker);
        double average = (double)sum/numbertracker;
        System.out.println("Average: "+average);
        int oddnumb= numbertracker-eventracker;
        System.out.println("Even numbers: "+eventracker);
        System.out.println("Odd numbers: "+oddnumb);
    }
}
