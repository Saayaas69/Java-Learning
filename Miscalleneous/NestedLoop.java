package Miscalleneous;

public class NestedLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println(i);

      for (int j = 1; j < 5; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
