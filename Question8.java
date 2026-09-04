
//Esli Quest Esabu 24019733
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Question8 {
    public static void main(String[]args){
        try {// Open numbers.txt file
            Scanner file = new Scanner (new File ("numbers.txt"));
            
            int evenCount = 0;
            int oddCount = 0;

            // Read every number
            while (file.hasNextInt()){
                int num = file.nextInt();
                if (num % 2 == 0) evenCount++;// Checking if the number is even or odd
                else oddCount++;
            }
            file.close();

            // Saving the results to evenodd.txt
            FileWriter writer = new FileWriter("evenodd.txt");
            writer.write("Even numbers: " + evenCount + "\n");
            writer.write("Odd numbers: " + oddCount + "\n");
            writer.close();
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage()); 
        }
    }
}
