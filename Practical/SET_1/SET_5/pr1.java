import java.util.*;
interface Order {
    void placeOrder(String item , int qty);
    void cancelOrder(int orderId);
    void generateBill();
}
abstract class PartialOrder implements Order {
    String itemName ;
    int quantity ;
    int orderId ;
    double price ;

    public void placeOrder(String item , int qty){
        this.itemName = item ;
        this.quantity = qty ;
        System.out.println("Order placed successfully for " + quantity + " " + itemName);
    }
}
class FinalOrder extends PartialOrder{
    FinalOrder(int orderId , double price){
        this.orderId = orderId ; 
        this.price = price ;
    }
    public void cancelOrder(int orderId){
        if(this.orderId == orderId){
            System.out.println("Order ID " + orderId + " has been cancelled.");
            this.itemName;
            this.quantity;
        }
        else{
            System.out.println("Invalid Order ID. Cancellation failed.");
        }
    }
    public void generateBill(){
        double total = quantity * price ;
        System.out.println("======|| Bill ||======");
        System.out.println("Order ID : " + orderId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price per item : Rs. " + price);
        System.out.println("Total Amount : Rs. " + total);
        System.out.println("=====================");
    }
}
public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Order ID:");
        int orderId = sc.nextInt();
        System.out.println("Enter Item Name : ");
        String itemName = sc.next();
        System.out.println("Enter Quantity : ");
        int qty = sc.nextInt();
        System.out.println("Enter Price per item : ");
        double price = sc.nextDouble();

        FinalOrder order = new FinalOrder(orderId, price);
        order.placeOrder(itemName, qty);

        System.out.println("====== || menu || ======");
        System.out.println("Press 1 to Generate Bill.");
        System.out.println("Press 2 to Cancel Order.");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                order.generateBill();
                break;
            case 2:
                System.out.println("Enter Order ID to cancel : ");
                int cancelId = sc.nextInt();
                order.cancelOrder(cancelId);
                break;
            default:
                System.out.println("Enter valid choice.");
                break;
        }
        sc.close();
    }
}
