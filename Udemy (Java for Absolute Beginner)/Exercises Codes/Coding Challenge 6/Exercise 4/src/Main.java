import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n### Guess My Number Game ###\n");

        System.out.println("--- Rules ---");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;
        int guess = (min + max) / 2;
        int guessCount = 0;

        while (true) {
            guessCount++;

            System.out.println("\nI guess " + guess + ".");
            System.out.print("Your response: ");
            input = scanner.next().toLowerCase(); // handles Higher/LOWER/etc.

            if (input.equals("higher")) {
                min = guess + 1;
            }
            else if (input.equals("lower")) {
                max = guess - 1;
            }
            else if (input.equals("correct")) {
                System.out.println("\n" + guess + ", easy peasy!");
                System.out.println("Solved in " + guessCount + " guesses.");
                break;
            }
            else {
                System.out.println("Please type: higher, lower, or correct.");
                guessCount--; // don't count invalid input
                continue;
            }

            // impossible range (user gave inconsistent answers)
            if (min > max) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
                guess = (min + max) / 2;
                guessCount = 0;
                continue;
            }

            guess = (min + max) / 2; // next best guess (binary search)
        }

        scanner.close();
    }
}