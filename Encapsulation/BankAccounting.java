package Encapsulation;

public class BankAccounting {
  public static void main(String[] args) {
    // creating object
    BankAccount saayaas = new BankAccount("Saayaas", 100000, "696969");
    System.out.println();
    System.out.println("New Account is Created:");
    System.out.println("Account Holder: " + saayaas.getAccountHolder());
    System.out.println("Account Number: " + saayaas.getAccountNumber());
    System.out.println("Initial Balance: " + saayaas.getBalance());

    // performing transactions
    saayaas.deposit(5000);
    saayaas.withdraw(2000);

    // updating account details
    saayaas.setAccountHolder("Saayaas Shrestha");
    System.out.println("Updated Account Holder Name: " + saayaas.getAccountHolder());
  }
}
