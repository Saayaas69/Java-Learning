import java.util.Scanner;

public class Arithmetic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Getting first number
    System.out.println("Enter the first number:");
    int number1 = scanner.nextInt();

    // Getting second number
    System.out.println("Enter the second number:");
    int number2 = scanner.nextInt();

    // Performing arithmetic operations

    int divide = number2 / number1;

    System.out.println("Dividing first number by second number is:" + divide);

    scanner.close();

  }
}
