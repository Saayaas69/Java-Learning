package Abstraction;

public class Main {
  public static void main(String[] args) {
    Order onlineOrder = new OnlineOrder(1, 5000,
        200);

    Order storePickup = new StorePickupOrder(2, 6969);

    // for onlineOrder
    System.out.println();
    onlineOrder.displayOrderDetails();
    System.out.println();
    onlineOrder.processOrder();
    System.out.println();
    onlineOrder.displayOrderDetails();
    onlineOrder.calculateTotal();
    System.out.println();

    // for store pick up order
    System.out.println();
    storePickup.displayOrderDetails();
    System.out.println();
    storePickup.processOrder();
    System.out.println();
    storePickup.displayOrderDetails();
    storePickup.calculateTotal();
  }

}
