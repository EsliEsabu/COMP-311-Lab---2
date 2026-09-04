import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){

try {
    Scanner file = new Scanner(new File("students.txt"));
    FileWriter writer = new FileWriter ("grades.txt");


    while(file.hasNextLine()){
        String[] parts = file.nextLine().split(",");
        String name = parts[0];
        int score = Integer.parseInt(parts[1]);

        String grade;
        if (score >= 80) grade = "A";
        else if (score >= 70) grade = "B";
        else if (score >= 60) grade = "C";
        else if (score >= 50)grade = "D";
        else grade = "F";

        writer.write(name + "," + score + "," + grade + "\n");
    }
    file.close();
    writer.close();
    System.out.println("Saved to grades.txt");
    
} catch (Exception e) {
    System.out.println("Error:" +e.getMessage());
}
    }
    
}
