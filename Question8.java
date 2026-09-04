import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Question8 {
    public static void main(String[]args){
        try {
            Scanner file = new Scanner (new File ("numbers.txt"));
            
            int evenCount = 0;
            int oddCount = 0;

            while (file.hasNextInt()){
                int num = file.nextInt();
                if (num % 2 == 0) evenCount++;
                else oddCount++;
            }
            file.close();

            FileWriter writer = new FileWriter("evenodd.txt");
            writer.write("Even numbers: " + evenCount + "\n");
            writer.write("Odd numbers: " + oddCount + "\n");
            writer.close();
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage()); 
        }
    }
}
