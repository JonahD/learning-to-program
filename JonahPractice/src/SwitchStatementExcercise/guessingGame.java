package SwitchStatementExcercise;

import java.util.Random;
import java.util.Scanner;

/**
 * Practice for loops by writing a random number guessing game.
 *
 * Created by jonah on 11/20/15.
 */
public class guessingGame {
    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        int guessCounter = 0;
        int randy = new Random().nextInt(10) + 1;

        System.out.println("Try to guess the right number.");
        System.out.println("Enter a number between 1 and 10:");

        int guess = keyboard.nextInt();
        guessCounter++;

        while (guess != randy){
            System.out.println("Sorry, try again.");
            guess = keyboard.nextInt();
            guessCounter++;

        }

        System.out.println("Your Winner!");
        System.out.println();
        System.out.println("You guessed " + guessCounter + " times.");

    }
}
