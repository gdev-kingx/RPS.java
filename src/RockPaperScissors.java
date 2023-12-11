import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r, p, or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);
            
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a TIE!");
            } 

            if (
                playerMove.equals("r") && computerMove.equals("p") ||
                playerMove.equals("p") && computerMove.equals("s") ||
                playerMove.equals("s") && computerMove.equals("r")
            ) {
                System.out.println("You LOST!");
            }

            if (
                playerMove.equals("r") && computerMove.equals("s") ||
                playerMove.equals("p") && computerMove.equals("r") ||
                playerMove.equals("s") && computerMove.equals("p")
            ) {
                System.out.println("You WIN!");
            }

            System.out.println("Play Again (y/n): ");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}
