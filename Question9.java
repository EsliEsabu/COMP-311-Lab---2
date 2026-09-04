import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Question9 {
    public static void main(String[]args){
        try {
            // Open the numbers.txt file
            Scanner file = new Scanner (new File ("numbers.txt"));

            long positiveSum = 0, negativeSum = 0;
            long positiveCount = 0, negativeCount = 0;
               
            // Read each number from the file
            while (file.hasNextInt()){
                int num = file.nextInt();
                if (num > 0){// Add positive numbers
                    positiveSum += num;
                    positiveCount++;
                } else if (num < 0){// Add negative numbers
                    negativeSum += num;
                    negativeCount++;
                }
            }
            file.close();

            FileWriter writer = new FileWriter ("signs.txt");
            writer.write("Positive total:" + positiveSum + " (+ " + positiveCount + " numbers)\n");
            writer.write("Negative total:" + negativeSum + " (+ " + negativeCount + " numbers)\n");
            writer.close();

            System.out.println("Saved to signs.txt");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        }
    }
    

