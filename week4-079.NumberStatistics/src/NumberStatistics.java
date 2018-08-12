
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        this.amountOfNumbers=amountOfNumbers;
        this.sum=sum;
    
    }
    
    public void addNumber(int number){
        this.amountOfNumbers+=1;
        this.sum+=number;
    }
    
    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        double average;
        if (this.amountOfNumbers==0){
            average=0;
        }
        else{
            average=(double)this.sum/this.amountOfNumbers;   
                
        }
        return average;
    }
}
