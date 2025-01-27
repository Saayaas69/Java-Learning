package Inheritence;

//Subclass
public class Car extends Vehicle { // inheritance property # extends

  public int numberOfDoors; // new unique attributes
  public String engine;
  public String seats;
  public int mileage;

  // Method
  public void activeAirCon() {
    System.out.println("Blowing cool air.");
  }

  // Constructor
  public Car(String make, String model, int year, int numberOfDoors, String engine, String seats, int mileage) {
    super(make, model, year);
    this.numberOfDoors = numberOfDoors;
    this.engine = engine;
    this.seats = seats;
    this.mileage = mileage;
  }

  // additional methods
  public void numberOfDoors() {
    System.out.println("Your Car has number of doors:" + numberOfDoors);
  }

  public void engine() {
    System.out.println("Your engine is:" + engine);
  }

  public void seats() {
    System.out.println("Car's seats are nos.:" + seats);
  }

  // overriding polymorphism

  public void displayDetails() {
    System.out.println("Type of vehicle:" + make);
    System.out.println("Model of Vehicle:" + model);
    System.out.println("Vehicle is made in:" + year);
  }

}
