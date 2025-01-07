package Miscalleneous;

public class PrimeNumber {
  public static void main(String[] args) {
    System.out.println("Prime numbers up to 50 are:");

    int number = 2;
    while (number <= 50) {
      if (isPrime(number)) {
        System.out.print(number + " ");
      }
      number++;
    }
  }

  // Method to check if a number is prime
  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    int i = 2;
    while (i <= Math.sqrt(n)) { // Loop from 2 to the square root of n
      if (n % i == 0) {
        return false; // If divisible by any number other than 1 and itself, not prime
      }
      i++;
    }
    return true;
  }
}
