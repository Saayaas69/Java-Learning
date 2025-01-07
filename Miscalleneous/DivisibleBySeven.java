package Miscalleneous;

public class DivisibleBySeven {
  public static void main(String[] args) {
    System.out.println("Numbers up to 50 that are divisible by 7:");

    for (int i = 1; i <= 50; i++) {
      if (i % 7 == 0) {
        System.out.println(i);
      }
    }
  }
}
