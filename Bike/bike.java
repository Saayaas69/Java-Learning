package Bike; // Class and Object

public class bike {
  public String name;

  public int year;

  public String color;

  public int fuel;

  public void start(int gear) {
    gear = 0;
    System.out.println("Bike is ignited and in neutrol mode.");
  }

  public void drive(int gear) {
    gear += 1;
    System.out.println("To ride a bike, change the gear");
  }

  public void fast(int gear) {
    gear += 4;
    System.out.println("You are on maximum speed.");
  }

  public void stop(int gear) {
    gear = 0;
    System.out.println("Your bike stopped.");
  }

  public void usedFuel(int ltr) {
    fuel -= ltr;
    System.out.println("Bike is using Fuel.");
  }

  public void refuel(int ltr) {
    System.out.println("Bike refueling.");
    fuel += ltr;
    System.out.println("Fuel:" + fuel);
  }

  public bike() {
  };

  public bike(String name, int year, String color, int fuel) {
    this.name = name;
    this.year = year;
    this.color = color;
    this.fuel = fuel;
  }
}
