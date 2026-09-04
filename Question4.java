//Esli Quest Esabu 24019733
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("results.txt");

            for (int i = 1; i <= 5; i++){
                System.out.println("Enter name "+ i + ":");
                String name = input.nextLine();


                System.out.println("Enter score" + i + ":");
                int score = input.nextInt();
                input.nextLine();
                writer.write(name + "," + score + "");
            }
            writer.close();
            System.out.println("Saved into results.txt");
            
        } catch (IOException e) {
            System.out.println("Error writing file. ");
        }
        
        
            
        
        }
    }
    

