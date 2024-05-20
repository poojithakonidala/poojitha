import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds: 3");
        System.out.println("Attempts To Guess Number In Each Round: 10\n");

        for (int round = 1; round <= MAX_ROUNDS; round++) {
            int targetNumber = random.nextInt(MAX_RANGE) + MIN_RANGE;
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", round, MIN_RANGE,
                    MAX_RANGE, MAX_ATTEMPTS);

            while (attempts < MAX_ATTEMPTS) {
                System.out.println("Enter your guess: ");
                int guessedNumber = scanner.nextInt();
                attempts++;

                if (guessedNumber == targetNumber) {
                    int score = MAX_ATTEMPTS - attempts;
                    totalScore += score;
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                            attempts, score);
                    break;
                } else if (guessedNumber < targetNumber) {
                    System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guessedNumber,
                            MAX_ATTEMPTS - attempts);
                } else {
                    System.out.printf("The number is less than %d. Attempts Left = %d.\n", guessedNumber,
                            MAX_ATTEMPTS - attempts);
                }
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.printf("\nRound = %d\n", round);
                System.out.println("Attempts = 0");
                System.out.printf("The Random Number Is: %d\n\n", targetNumber);
            }
        }

        System.out.printf("Game Over. Total Score = %d\n", totalScore);
        scanner.close();
    }
}
 