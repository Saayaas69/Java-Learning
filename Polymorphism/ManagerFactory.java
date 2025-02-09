package Polymorphism;

public class ManagerFactory {
  public static void main(String[] args) {
    Manager Samyak = new Manager("Samyak", 1, 25000, 4000);
    System.out.println();
    Samyak.displayDetails("Hi, there!:");
    Samyak.calculateSalary();

    System.out.println();
    Manager Raj = new Manager("Raj Shrestha", 2, 17500, 2000);
    System.out.println();
    Raj.displayDetails("Fighter!:");
    Raj.calculateSalary();

    System.out.println();
    Manager Dipankar = new Manager("Dipankar Shrestha", 3, 13000, 3000);
    System.out.println();
    Dipankar.displayDetails("Assasin!:");
    Dipankar.calculateSalary();

    System.out.println();
    Manager Roshan = new Manager("Roshan Khanal", 4, 22000, 1100);
    System.out.println();
    Roshan.displayDetails("Entry Fragger!:");
    Roshan.calculateSalary();

    System.out.println();
    Manager Shishir = new Manager("Shishir Chauhan", 5, 14000, 2000);
    System.out.println();
    Shishir.displayDetails("Mage!:");
    Shishir.calculateSalary();

    System.out.println();
    Manager Bhimsen = new Manager("Bhimsen Basnet", 6, 20000, 1000);
    System.out.println();
    Bhimsen.displayDetails("Newbie!:");
    Bhimsen.calculateSalary();

  }

}
