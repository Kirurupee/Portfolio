import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER.");
            }
            else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}