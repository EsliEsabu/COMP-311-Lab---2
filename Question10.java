import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question10 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);// Get the number  user
        System.out.println("Enter a number to search for:");
        int target = input.nextInt();

        boolean found = false;
        
        try {// Open the file
            Scanner file = new Scanner(new File("students.txt"));
            
            // Search through the file
            while (file.hasNextLine()){
                if (file.nextInt() == target) {
                    found = true;
                    break;
                }
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error:" + e.getMessage());
        }
       
    }
}
