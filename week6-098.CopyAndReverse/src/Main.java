

public class Main {

    public static void main(String[] args) {
     int[] original = {1, 2, 3, 4};
     int[] reverse = reverseCopy(original);
        System.out.println(reverse.toString());
        
    }
    public static int[] copy(int[] array){
         int copied[] = new int[array.length];
         for(int i=0;i<copied.length;i++){
             copied[i]=array[i];
        }
         return copied;
    }
    
    public static int[] reverseCopy(int[] array){
        int copy[]=copy(array);
        int index=copy.length-1;
        for (int i =0;i<copy.length;i++){
            copy[i]=array[index];
            index-=1;
        }
        return copy;
    }
    
}
