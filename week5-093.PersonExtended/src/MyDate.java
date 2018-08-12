
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }
    
    public int getDate(){
        return this.day;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getYear(){
        return this.year;
    }
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate){
        
    int yearDiff=this.year-comparedDate.year;    
        
    if (!this.earlier(comparedDate)){
        
        
        if (this.month<comparedDate.month){
            yearDiff--;
            return yearDiff;
        }
        else if (this.month>comparedDate.month){
            return yearDiff;
        }
        else {
            if (this.day>comparedDate.day){
                return yearDiff;
            }
            else if (this.day==comparedDate.day){
                
                return yearDiff;
            }
            else {
                yearDiff--;
                return yearDiff;
            }
        } 
    }
    else {
        yearDiff=comparedDate.year-this.year;
        if (this.month>comparedDate.month){
            yearDiff--;
            return yearDiff;
        }
        else if (this.month<comparedDate.month){
            return yearDiff;
        }
        else {
            if (this.day<comparedDate.day){
                return yearDiff;
            }
            else if (this.day==comparedDate.day){
                
                return yearDiff;
            }
            
            else {
                yearDiff--;
                return yearDiff;
            }
        } 
        
        }
    }
    

  
}
