import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("I'm thinking of a number from 1 to 5. Try to guess it.");
        System.out.print("Your guess: ");

        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("Correct! Aren't you lucky.");
        }
        else {
            System.out.println("Hard luck! Maybe next time.");
        }

        scanner.close();
    }
}