import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Restaurant Bill Calculator\n");

        System.out.print("Enter bill total: £");
        double bill = scanner.nextDouble();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        double eachPay = bill / people;

        System.out.format(
                "A bill of £%.2f split between %d people comes to approximately £%.2f each",
                bill, people, eachPay
        );

        scanner.close();
    }
}