package Abstraction;

public class StorePickupOrder extends Order {
  public StorePickupOrder(int orderId, double amount) {
    super(orderId, amount);
  }

  @Override
  public void processOrder() {
    System.out.println("Processing store pickup order...");
    this.status = "Ready for the Pickup";
  }

  @Override
  public void calculateTotal() {
    System.out.println("Total Amount:" + getAmount());
  }

}
