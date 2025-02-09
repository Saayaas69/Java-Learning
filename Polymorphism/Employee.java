package Polymorphism;

public class Employee {
  // attributes or fields
  public String name;
  public int id;
  public double baseSalary;

  public Employee(String name, int id, double baseSalary) {
    this.name = name;
    this.id = id;
    this.baseSalary = baseSalary;
  }

  // methods
  public void displayDetails(String message) {
    System.out.println("Employee ID:" + id);
    System.out.println("Additional message:" + message);
    System.out.println("Name of the Employee:" + name);
    System.out.println("Base Salary of an Employee is Rs. :" + baseSalary);
  }

  public void calculateSalary() {
    System.out.println("Salary of an Employee:" + baseSalary);
  }

}
