package methodsFunction;

public class Celcius {
  public static void main(String[] args) {
    int f = 157;

    printTemp(f);
  }

  public static void printTemp(int f) {
    float c = (5.0f / 9) * (f - 32);
    System.out.println("The Celcius Temperature is:" + c);
  }
}
