public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initalvalue;
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initalvalue=valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value>0){
            this.value-=1;
        } 
    }
    
    public void reset(){
        this.value=0;
    }
    
    public void setInitial(){
        this.value=initalvalue;
    }

    // and here the rest of the methods
}
