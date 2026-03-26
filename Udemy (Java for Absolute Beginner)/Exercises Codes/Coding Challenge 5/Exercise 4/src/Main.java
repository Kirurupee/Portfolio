import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your top five favourite foods.\n");

        String[] foods = new String[3];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("No more memory available.\n");

        System.out.println("Your favourite foods are:");
        for (int i = 0; i < foods.length; i++) {
            System.out.println(" - " + foods[i]);
        }

        scanner.close();
    }
}