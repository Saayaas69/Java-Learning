package Miscalleneous;

public class reversed {
  public static void main(String[] args) {
    int num = 69691;
    int reversed = 0;

    while (num > 0) {
      int lastDigit = num % 10;
      reversed = reversed * 10 + lastDigit;
      num /= 10;
    }
    System.out.println("Reversed Number:" + reversed);
  }
}
