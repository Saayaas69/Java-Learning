package Encapsulation;

//private fields
class BankAccount {
  private String accountHolder;
  private double balance;
  private String accountNumber;

  // constructor
  public BankAccount(String accountHolder, double balance, String accountNumber) {
    this.accountHolder = accountHolder;
    this.balance = balance;
    this.accountNumber = accountNumber;
  }

  // Getter and Setter
  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    if (balance >= 0) {
      this.balance = balance;
    } else {
      System.out.println("Balance cannot be negative, Please enter a positive number.");
    }
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  // methods
  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposit Successful! Your new balance is:" + balance);
  }

  public void withdraw(double amount) {
    balance -= amount;
    System.out.println("Your remaining balance after withdrawal is." + balance);
  }
}
