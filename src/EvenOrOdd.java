import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String[] args){

        scanner input = new scanner(System.in);


        // user input
        System.out.print("Enter a number: ");
        boolean number = input.nextInt();


        // calculations and output
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }



    }
}
