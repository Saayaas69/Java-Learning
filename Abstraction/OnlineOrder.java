package Abstraction;

public class OnlineOrder extends Order {
  public int deliveryCharge;

  public OnlineOrder(int orderId, double amount, int deliveryCharge) {
    super(orderId, amount);
    this.deliveryCharge = deliveryCharge;
  }

  @Override
  public void processOrder() {
    System.out.println("Processing online order...");
    this.status = "Delivered";
  }

  @Override
  public void calculateTotal() {
    setAmount(getAmount() + deliveryCharge );
    System.out.println("Total Amount Rs.:" + getAmount());
  }
}
