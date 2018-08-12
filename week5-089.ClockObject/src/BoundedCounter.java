
public class BoundedCounter {
    private int counter;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.counter=0;
        this.upperLimit=upperLimit;
    }
    
    public void next(){
        if (this.counter<this.upperLimit){
            this.counter+=1;
        }
        else {
            this.counter=0;
        }   
    }
    
    public String toString(){
        String stringcounter="";
        if (this.counter<10){
            stringcounter="0"+Integer.toString(this.counter);
        }
        else{
            stringcounter=Integer.toString(this.counter);
        }
        return stringcounter;
        }
    
    public int getValue(){
        return this.counter;
    }
    
    public void setValue(int value){
        if (this.counter+value<=upperLimit && value>0){
            this.counter=value;
        }
    }
    
}
