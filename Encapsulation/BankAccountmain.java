package Encapsulation;

public class BankAccountmain {
  public static void main(String[] args) {
    // creating object
    BankAccount roshan = new BankAccount("Roshan", 100000, "696969");

    System.out.println("Account Holder: " + roshan.getAccountHolder());
    System.out.println("Account Number: " + roshan.getAccountNumber());
    System.out.println("Initial Balance: " + roshan.getBalance());

    // performing transactions
    roshan.deposit(5000);
    roshan.withdraw(2000);

    // updating account details
    roshan.setAccountHolder("Roshan Khanal");
    System.out.println("Updated Account Holder Name: " + roshan.getAccountHolder());
  }
}
