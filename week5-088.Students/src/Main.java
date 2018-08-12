
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        while (true){
            System.out.println("name: ");
            String input = reader.nextLine();
            //if an empty string break
            if (input.isEmpty()){
                break;
            }
            else {
                //get the student number
                System.out.println("studentnumber: ");
                String studentNumber = reader.nextLine();
                //add the new student to the ArrayList
                Student tempStudent = new Student(input, studentNumber);
                students.add(tempStudent);
            }
        }
            
        for (Student student : students){
            System.out.println(student.toString());
        }
        
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        for (Student student : students){
            String name=student.getName();
            if (name.contains(searchTerm)){
                System.out.println(student.toString());
            }
            
        }
            
    }
}

