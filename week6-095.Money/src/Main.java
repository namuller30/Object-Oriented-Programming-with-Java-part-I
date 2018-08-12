
public class Main {

    public static void main(String[] args) {
Money r1 = new Money(10, 0);
Money r2 = new Money(7, 40);
Money r3 = r1.minus(r2);
 r3.euros();         // NOTE: new Money-object is created and reference to that is assigned to variable c
                        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

System.out.println(r3.euros());
        System.out.println(r3.cents());// 10.00e
  // 3.50e
 // 0.00e
    }
}
