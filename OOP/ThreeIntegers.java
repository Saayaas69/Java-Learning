package OOP;

public class ThreeIntegers {
  public static void main(String[] args) {

    int a = 69;
    int b = 79;
    int c = 89;

    printGreatestNumber(a, b, c);

  }

  public static void printGreatestNumber(int a, int b, int c) {
    if (a > b && a > c) {
      System.out.println("The greatest number is: " + a);
    } else if (b > a && b > c) {
      System.out.println("The greatest number is:" + b);
    } else {
      System.out.println("The greatest number is:" + c);
    }
  }
}
