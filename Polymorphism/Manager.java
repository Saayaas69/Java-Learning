package Polymorphism;

public class Manager extends Employee { // inheriting Employee

  public double bonus; // additional attribute

  public Manager(String name, int id, double baseSalary, double bonus) {
    super(name, id, baseSalary);
    this.bonus = bonus;
  }

  // overiding
  public void calculateSalary() {
    baseSalary += bonus;
    System.out.println("Salary of an Employee " + name + " is Rs. " + baseSalary);
  }
}
