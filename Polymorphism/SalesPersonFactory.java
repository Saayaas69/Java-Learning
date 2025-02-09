package Polymorphism;

public class SalesPersonFactory {
  public static void main(String[] args) {
    SalesPerson Samrat = new SalesPerson("Samrat Timalsina", 24, 16000, 2500);
    System.out.println();
    Samrat.displayDetails("Madrista!");
    Samrat.calculateSalary();

    System.out.println();
    SalesPerson Aashish = new SalesPerson("Aashish Adhikari", 25, 11000, 250);
    System.out.println();
    Aashish.displayDetails("E-football Player!");
    Aashish.calculateSalary();

    System.out.println();
    SalesPerson Anubhav = new SalesPerson("Anubhav Basnet", 26, 13600, 700);
    System.out.println();
    Anubhav.displayDetails("Noob Marksman!");
    Anubhav.calculateSalary();
  }

}
