public class Main {
    public static void main(String[] args) {

        // create array of five doubles
        double[] numbers = {12.5, 8.3, 15.7, 10.0, 6.5};

        double sum = 0;

        // calculate sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // calculate average
        double average = sum / numbers.length;

        // print results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

    }
}