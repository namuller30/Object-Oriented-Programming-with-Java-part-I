import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers");
        NumberStatistics allstats = new NumberStatistics();
        NumberStatistics evenstats = new NumberStatistics();
        NumberStatistics oddstats = new NumberStatistics();
        
        
        
        while (true){
            int input = Integer.parseInt(reader.nextLine());
            if (input!=-1){
                allstats.addNumber(input);
                if (input%2==0){
                   evenstats.addNumber(input); 
                }
                else{
                    oddstats.addNumber(input);
                }
            }
            else{
                break;
            }
        }
        
        System.out.println("sum: "+allstats.sum());
        System.out.println("sum of even: "+evenstats.sum());
        System.out.println("sum of odd: "+oddstats.sum());

    }
}
