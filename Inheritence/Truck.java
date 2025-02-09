package Inheritence;

//Subclass
public class Truck extends Vehicle {
  public double cargoCapacity;
  public String mileageperkm;

  // Method
  public void activeTowing() {
    System.out.println("Towing with power.");
  }

  // Constructor
  public Truck(String make, String model, int year, double cargoCapacity, String mileageperkm) {
    super(make, model, year);
    this.cargoCapacity = cargoCapacity;
    this.mileageperkm = mileageperkm;

  }

  // extra-methods
  public void cargoCapacity() {
    System.out.println("Your trucks cargo carrying capacity is:" + cargoCapacity);
  }

  public void mileageperkm() {
    System.out.println("Your trucks mileage per km is:" + mileageperkm);
  }

  // overriding
  public void displayDetails() {
    System.out.println("Type of vehicle:" + make);
    System.out.println("Model of Vehicle:" + model);
    System.out.println("Vehicle is made in:" + year);
  }

}
