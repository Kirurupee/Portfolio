import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter Password: ");
            input = scanner.next();
        } while (!input.equals("hehe123"));

        System.out.println("ACCESS APPROVED");

        scanner.close();
    }
}