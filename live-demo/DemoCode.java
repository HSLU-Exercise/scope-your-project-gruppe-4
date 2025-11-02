// Demo Code für Live-Demo
// vor Start kopieren und in sc neuen Code anlegen
// Fehler: interger = input.nextInt(); müsste sein: number = input.nextInt();

import java.util.Scanner;

public class DoWhileDemo {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        do{
            System.out.print("Enter a positive number: ");
            integer = input.nextInt();
        }while(number <= 0);

        System.out.println("You entered: " + number);

    }
}
