
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        int totaleuros=this.euros+added.euros();
        int totalcents=this.cents+added.cents();
        Money total = new Money(totaleuros, totalcents);
        return total;
    }
    
    public boolean less(Money compared){
        if ((this.euros)<(compared.euros())){
            return true;
        }
        else if (this.euros==compared.euros()){
            if (this.cents>=compared.cents){
                return false;
            }
            else{
                return true;
            }
        }
        else {
            return false;
        }
        
    }
        
    
    public Money minus(Money decremented){
        if (this.less(decremented)){
            Money total = new Money(0,0);
            return total;
        }
        else {
            int totaleuros=this.euros-decremented.euros();
            int totalcents=this.cents-decremented.cents();
            //if cents is negative we need to go down a euro 
            if (totalcents<0){
                totaleuros-=1;
                //the total cents is negative here so you have to add it
                totalcents=100+totalcents;
            }
            
            Money total = new Money(totaleuros, totalcents);
            return total;
        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
