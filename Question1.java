//Esli Quest Esabu
// 24019733

import java.util.Scanner;

public class Question1 {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println ("Enter marks:");

        double mark = input.nextDouble();
// chek if mark is less than 50
        if (mark < 50 ){
            System.out.println("Grade: F");
        }
        // check if mark is between 50 and less than 60
        else if (mark >= 50 && mark < 60){
            System.out.println("Grade: D");
        }
        // check if mark is between 60 and less than 70
        else if (mark >= 60 && mark <= 69){
            System.out.println("Grade: C");
        }
        // chcek if mark is between 70 and less than 80
        else if (mark >= 70 && mark <= 79){
            System.out.println("Grade: B");
        }
        // any mark greater than or equal to 80
        else {
            System.out.println("Grade: A");
        }




    }
    
}
