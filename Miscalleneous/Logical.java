package Miscalleneous;

public class Logical {
  public static void main(String[] args) {
    int a = 1000;
    boolean divisible = (a % 3 == 0) || (a % 5 == 0) && (a % 2 != 0);
    System.out.println(divisible);
  }
}
