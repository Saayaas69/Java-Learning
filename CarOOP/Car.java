package CarOOP;

public class Car {

  // Attributes
  public String name;

  public String color;

  public int year;

  public int price;

  public int fuel;

  // Methods
  public void start() {
    System.out.println("Your car is running. Drive safely :) ");
  }

  public void drive() {
    System.out.println("Car is driving");

  }

  public void stop() {
    System.out.println("Stoppp");
  }

  public void usedFuel(int ltr) {
    System.out.println("Car is using fuel");
    fuel -= ltr;
  }

  public void refuel(int ltr) {
    System.out.println("Car refueling");
    fuel += ltr;
    System.out.println("Remaining fuel is:" + fuel);
  }

  // Constructors
  public Car() {
  };

  public Car(String name, String color, int year, int price) {
    this.name = name;
    this.color = color;
    this.year = year;
    this.price = price;
  }

}