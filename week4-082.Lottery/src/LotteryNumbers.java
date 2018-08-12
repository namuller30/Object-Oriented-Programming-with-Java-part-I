import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
        this.random=new Random();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        //now create the random numbers
        int testint;
        Random random=new Random();
        
        for (int i=0;i<7;i++){
            testint=random.nextInt(40);
            while (true){
                if (testint==0 || containsNumber(testint)==true){
                    testint=random.nextInt(40);
                }
                else{
                    break;
                }
            }
            
            this.numbers.add(i, testint);
            
        }
        System.out.println("hello");
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)){  //return true if number is already there
            return true;
        }
        else{
             return false;
        }
            
       
    }
}
