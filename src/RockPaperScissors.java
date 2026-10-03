import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String aMove = "";
        String bMove = "";
        boolean loop = true;
        String playAgain = "";
        do {
            boolean loopA = true;
            do {
                System.out.print("Player A, enter your move as either 'R' or 'r' for Rock, 'P' or 'p' for Paper, or 'S' or 's' for Scissors: ");
                String userChoice = in.nextLine();
                if (userChoice.equalsIgnoreCase("R")) {
                    aMove = userChoice;
                    loopA = false;
                }
                else if (userChoice.equalsIgnoreCase("P")) {
                    aMove = userChoice;
                    loopA = false;
                }
                else if (userChoice.equalsIgnoreCase("S")) {
                    aMove = userChoice;
                    loopA = false;
                }
                else {
                    System.out.println("Invalid Input. Must enter either 'R' or 'r' for Rock, 'P' or 'p' for Paper, or 'S' or 's' for Scissors.");
                }
            }
            while (loopA);
            boolean loopB = true;
            do {
                System.out.print("Player B, enter your move as either 'R' or 'r' for Rock, 'P' or 'p' for Paper, or 'S' or 's' for Scissors: ");
                String userChoice = in.nextLine();
                if (userChoice.equalsIgnoreCase("R")) {
                    bMove = userChoice;
                    loopB = false;
                }
                else if (userChoice.equalsIgnoreCase("P")) {
                    bMove = userChoice;
                    loopB = false;
                }
                else if (userChoice.equalsIgnoreCase("S")) {
                    bMove = userChoice;
                    loopB = false;
                }
                else {
                    System.out.println("Invalid Input. Must enter either 'R' or 'r' for Rock, 'P' or 'p' for Paper, or 'S' or 's' for Scissors.");
                }
            }
            while (loopB);
            if (aMove.equalsIgnoreCase("R")) {
                if (bMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock it's a Tie!");
                }
                else if (bMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock\nPlayer B wins");
                }
                else {
                    System.out.println("Rock breaks Scissors\nPlayer A wins");
                }
            }
            if (aMove.equalsIgnoreCase("P")) {
                if (bMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock\nPlayer A wins");
                }
                else if (bMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper it's a Tie!");
                }
                else {
                    System.out.println("Scissors cut Paper\nPlayer B wins");
                }
            }
            if (aMove.equalsIgnoreCase("S")) {
                if (bMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors\nPlayer B wins");
                }
                else if (bMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut paper\nPlayer A wins");
                }
                else {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                }
            }
            boolean loopPlayAgain = true;
            do {
                System.out.print("Play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y")) {
                    loopPlayAgain = false;
                }
                else if (playAgain.equalsIgnoreCase("N")) {
                    loop = false;
                    loopPlayAgain = false;
                }
                else {
                    System.out.println("Invalid Input. Must enter either 'Y' or 'y' to play again, or 'N' or 'n' to stop playing.");
                }
            }
            while (loopPlayAgain);
        }
        while (loop);
        }
    }