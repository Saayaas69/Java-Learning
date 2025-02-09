package Inheritence;

public class Truckfac {
  public static void main(String[] args) {
    Truck Volvo = new Truck("Volvo F12", "12/240", 1976, 11980, "12/km");

    System.out.println();
    Volvo.displayDetails();
    // System.out.println("Volvo truck is created:");
    // System.out.println("Truck make:" + Volvo.make);
    // System.out.println("Truck model:" + Volvo.model);
    // System.out.println("Truck make year:" + Volvo.year);
    Volvo.cargoCapacity();
    Volvo.startVehicle();
    Volvo.activeTowing();
    Volvo.mileageperkm();
  }
}
