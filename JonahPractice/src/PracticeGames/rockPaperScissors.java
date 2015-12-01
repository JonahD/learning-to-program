package PracticeGames;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by jonah on 11/20/15.
 */
public class rockPaperScissors {
    private enum Choice {
        ROCK("rock"),
        PAPER("paper"),
        SCISSORS("scissors"),
        ;

        private final String representation;

        private Choice(String representation) {
            this.representation = representation;
        }

        private static Choice getChoice(String originalOption) {
            String option = originalOption.toLowerCase().substring(0, 1);
            if ("r".equals(option)) {
                return ROCK;
            } else if ("p".equals(option)) {
                return PAPER;
            } else if ("s".equals(option)) {
                return SCISSORS;
            } else {
                throw new RuntimeException("Illegal option: " + originalOption);
            }
        }
        private static Choice getChoice(int originalOption) {
            if (1 == originalOption) {
                return ROCK;
            } else if (2 == originalOption) {
                return PAPER;
            } else if (3 == originalOption) {
                return SCISSORS;
            } else {
                throw new RuntimeException("Illegal option: " + originalOption);
            }
        }

        public String toString() {
            return representation;
        }
    }

    public static void main(String [] args){

        System.out.println("Enter rock, paper, or scissors.");
        Scanner keyboard = new Scanner(System.in);
        String playerStringChoice = keyboard.next();
        Choice playerChoice = Choice.getChoice(playerStringChoice);

        int compy = new Random().nextInt(3) + 1;
        Choice computerChoice = Choice.getChoice(compy);

        if(playerChoice.equals(computerChoice)) {
            System.out.println("Its a tie!");
        }
        else if(playerChoice.equals(Choice.ROCK)) {
            if (computerChoice.equals(Choice.PAPER)) {
                System.out.println("Computer Wins!");
            }
            else if (computerChoice.equals(Choice.SCISSORS)) {
                System.out.println("You Win!");
            }
        }
        else if(playerChoice.equals(Choice.PAPER)) {
            if (computerChoice.equals(Choice.ROCK)) {
                System.out.println("You Win!");
            }
            else if (computerChoice.equals(Choice.SCISSORS)) {
                System.out.println("Computer Wins");
            }
        }
        else if(playerChoice.equals(Choice.SCISSORS)) {
            if (computerChoice.equals(Choice.ROCK)) {
                System.out.println("Computer Wins!");
            }
            else if (computerChoice.equals(Choice.PAPER)) {
                System.out.println("You Win!");
            }
        }




    }
}
