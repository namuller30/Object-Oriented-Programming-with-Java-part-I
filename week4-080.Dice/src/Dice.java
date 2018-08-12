import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides=numberOfSides;
        random = new Random();
    }

    public int roll() {
        int result;
        while (true){
            result=random.nextInt(this.numberOfSides+1);
            if(result!=0){
                break;
            }
        }
        
        return result;
    }
}
