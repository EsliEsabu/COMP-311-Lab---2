import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Question7 {
    public static void main(String[]args){
        try {
            Scanner file = new Scanner (new File("numbers.txt"));
int smallest = Integer.MAX_VALUE;
int largest = Integer.MIN_VALUE;
long sum = 0;
int count = 0;

while (file.hasNextInt()){
    int num = file.nextInt();
    if (num < smallest) smallest = num;
    if (num > largest) largest = num;
    sum += num;
    count++;
}

file.close();

double average = (double) sum / count;

FileWriter writer = new FileWriter("stats.txt");
writer.write("Smallest:"+ smallest + "\n");
writer.write("Largest:"+ largest + "\n");
writer.write("Average:"+ average + "\n");
writer.close();

System.out.println("Saved to stats.txt");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        }
    }
