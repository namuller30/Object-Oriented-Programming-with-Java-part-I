import java.util.*;

public class Main {
    public static void main(String[] args) {
int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
    }
    
    public static int smallest(int[] array) {
    int lowestInt=array[0];
    for (int i=0;i<array.length;i++){
        if (array[i]<lowestInt){
            lowestInt=array[i];
        } 
    }
    return lowestInt;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallestNumber=smallest(array);
        for (int i=0;i<array.length;i++){
            if (smallestNumber==array[i]){
                return i;
            } 
        }
        //this should never be hit - just to satisfy compiler
        return 0;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int[] copy = Arrays.copyOfRange(array, index, array.length);
        int indexOftheSmallestCopy=indexOfTheSmallest(copy);
        indexOftheSmallestCopy+=index;
        return indexOftheSmallestCopy;      
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int index1Value=array[index1];
        int index2Value=array[index2];
        array[index1]=index2Value;
        array[index2]=index1Value;
    }
    
    public static void sort(int[] array) {
        for (int i =0;i<array.length;i++){
        int indexsmallestValue=indexOfTheSmallestStartingFrom(array, i);
        swap(array,i,indexsmallestValue);
            System.out.println(Arrays.toString(array));
    }
    }
  

}
