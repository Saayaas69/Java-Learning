package Inheritence;

//Super Class
public class Vehicle {
  // properties or Attributes
  public String make;

  public String model;

  public int year;

  // Method
  public void startVehicle() {
    System.out.println("Vehicle is Starting.");
  }

  // Method to display the vehicle details
  public void displayDetails(String make, String model, int year) {
    System.out.println("Your vehicle make:" + make);
    System.out.println("Vehicle model:" + model);
    System.out.println("Vehicle made year:" + year);
  }

  // constructor
  public Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }
}
