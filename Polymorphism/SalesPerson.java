package Polymorphism;

public class SalesPerson extends Employee {
  public double commission;

  public SalesPerson(String name, int id, double baseSalary, double commission) {
    super(name, id, baseSalary);
    this.commission = commission;
  }

  // overriding
  public void calculateSalary() {
    baseSalary += commission;
    System.out.println("Salary of an Employee " + name + " is Rs. " + baseSalary);
  }
}
