public class Main {
    public static void main(String[] args) {

        int[] intArr = new int[20];

        // populate array with 1 to 20
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        // print array backwards
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }

    }
}