import java.util.*;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    Scanner scanner = new Scanner(System.in); 
    BirdDatabase database = new BirdDatabase();
    while (true){
        System.out.print("? ");
        String input=scanner.nextLine();
        
        
        if (input.equals("Add")){
            System.out.print("Name: ");
            String name=scanner.nextLine();
            System.out.print("Latin Name: ");
            String latinName=scanner.nextLine();
            Bird newBird = new Bird(name, latinName);
            database.addBird(newBird);
        }
        
        
        else if (input.equals("Observation")){
            System.out.println("What was observed:? ");
            String compare=scanner.nextLine();
            if (database.contains(compare)){
                database.getByName(compare).observe();
                
            }
            else{
                System.out.println("Is not a bird!");
            }
        }
        
        
        else if(input.equals("Statistics")){
            database.printAll();
            
        }
        
        else if (input.equals("Show")){
            System.out.print("What? ");
            String birdname=scanner.nextLine();
            System.out.println(database.getByName(birdname));
        }
        
        else if (input.equals("Quit")){
            break;
        }
    }
    }

}
