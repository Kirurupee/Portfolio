public class Main {
  public static void main(String[] args) {

    int x = 2;
    int y = 4;

    if (x > y) {
      System.out.println("x is bigger than y");
    }
    else if (x < y) {
      System.out.println("x is smaller than y");
    }
    else {
      System.out.println("x and y are the same");
    }

    int difference = Math.abs(x - y);
    System.out.println("The difference between x and y is " + difference);

  }
}