package CarOOP;

public class CarFactory {

  public static void main(String[] args) {

    // Creating a new object of class car
    Car bmw = new Car("BMW X1", "Black", 2018, 98000);
    // Accessing its attributes
    System.out.println("Object of car is created.");
    System.out.println("Car name: " + bmw.name);
    System.out.println("Car color: " + bmw.color);
    System.out.println("Car year: " + bmw.year);
    System.out.println("Car price: " + bmw.price);

    // Accessing its methods
    bmw.start();
    bmw.drive();
    bmw.usedFuel(100);
    bmw.refuel(169);
    bmw.stop();

    System.out.println();

    // Creating another object of class car
    Car toyata = new Car("Camry", "White", 2021, 58000);

    // Accessing its attributes
    System.out.println("Another Object of car is created.");
    System.out.println("Car name: " + toyata.name);
    System.out.println("Car color: " + toyata.color);
    System.out.println("Car year: " + toyata.year);
    System.out.println("Car price: " + toyata.price);

    // Accessing its methods
    toyata.start();
    toyata.drive();
    toyata.stop();

  }
}