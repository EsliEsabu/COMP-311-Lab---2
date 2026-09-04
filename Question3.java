import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[]args) {
        try {
            Scanner file = new Scanner(new File("students.txt"));
            
            while (file.hasNextLine()){
                String line = file.nextLine();
                String[] parts = line.split(",");
                System.out.println("Name:" + parts[0] + " |  Score:" + parts[1]);
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt file not found.");
        }
       
    }
}
