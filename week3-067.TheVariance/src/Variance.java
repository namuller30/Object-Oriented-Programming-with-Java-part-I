import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for(int number: list){
            sum+=number;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        double average = (double)sum/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        double variancetotal=0;
        for (int number:list){
           double toexpo= (number-average);
           double afterexpo=Math.pow(toexpo, 2);
           double finalnumber=afterexpo/(list.size()-1);
           variancetotal+=finalnumber;
           
        }
        return variancetotal;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
