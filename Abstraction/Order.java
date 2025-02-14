package Abstraction;

public abstract class Order {
  private int orderId;
  private double amount;
  public String status;

  public Order(int orderId, double amount) {
    this.orderId = orderId;
    this.amount = amount;
    this.status = "Pending";
  }

  public abstract void processOrder();

  public abstract void calculateTotal();

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double b) {
    this.amount = b;
  }

  public void displayOrderDetails() {
    System.out.println("Order ID:" + getOrderId());
    System.out.println("Order Amount:" + getAmount());
    System.out.println("Status:" + status);
  }

}
