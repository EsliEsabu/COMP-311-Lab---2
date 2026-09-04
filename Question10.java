import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question10 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to search for:");
        int target = input.nextInt();

        boolean found = false;
        
        try {
            Scanner file = new Scanner(new File("students.txt"));
            
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
