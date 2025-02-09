package Inheritence;

public class Carfac {
  public static void main(String[] args) {
    Car Toyota = new Car("Camry", "ASV70", 1982, 4, "Fuel engine", "five", 15);

    System.out.println();

    // accessing its attributes

    System.out.println("Toyota Car is created:");
    // System.out.println("Car make:" + Toyota.make);
    // System.out.println("Car model:" + Toyota.model);
    // System.out.println("Car make year:" + Toyota.year);
    Toyota.displayDetails();
    Toyota.startVehicle(); // calling methods
    Toyota.activeAirCon();
    Toyota.numberOfDoors();
    Toyota.engine();
    Toyota.seats();
    System.out.println("Car's mileage per km is:" + Toyota.mileage); // calling constructors
  }
}
