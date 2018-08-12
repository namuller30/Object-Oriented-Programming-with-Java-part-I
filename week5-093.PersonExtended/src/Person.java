import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this(name, birthday.getDate(), birthday.getMonth(), birthday.getYear());
    }
    
    public Person(String name){
        this(name,Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH)+1, Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public int age() {
        
        int day=Calendar.getInstance().get(Calendar.DATE);
        int month=Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year=Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(day, month, year);
        return today.differenceInYears(birthday);
        
    }
    
    public boolean olderThan(Person compared) {
        if (this.birthday.earlier(compared.birthday)){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    
}
