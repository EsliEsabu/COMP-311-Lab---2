import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Enter fullname:");
        String fullname = input.nextLine();

        System.out.println("Enter letter:");
        char letter = input.next().charAt(0);

        System.out.println("Length :" + fullname.length());
        System.out.println("Uppercase :" + fullname.toUpperCase());
        System.out.println("Lowercase:" + fullname.toLowerCase());
        System.out.println("Starts with" + letter + ":" +
        fullname.toLowerCase().startsWith(String.valueOf(letter).toLowerCase()));
       


    }
}
