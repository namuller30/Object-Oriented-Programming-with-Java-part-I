public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
         for (int i=0;i<amount;i++){
            System.out.print("*");
            
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        for(int i=0;i<amount;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int starCounter=1;
        while (size>0){
            printWhitespaces(size-1);
            printStars(starCounter);
            starCounter++;
            size--;
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        int starcounter=1;
        int decounter=height;
        for (int i=0;i<height;i++){
            printWhitespaces(decounter-1);
            printStars(starcounter);
            starcounter+=2;
            decounter--;
        }
        for (int j=0;j<2;j++){
            printWhitespaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
