package pr4;
import java.util.*;
class Payment{
    void processPayment(int amount){
        System.out.println("Processing Payment of Rs. " + amount);
    }
}
class CreditCardPayment extends Payment {
    void processPayment(int amount) {
        System.out.println("Paymen of Rs. " + amount + " done using Credit Card.");
    }
}
class UPIPayment extends Payment {
    void ProcessPayment(int amount){
         System.out.println("Paymen of Rs. " + amount + " done using UPI.");
    }
}
public class pr2 {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Payment p ;
      System.out.println("Select Payment method :");
      System.out.println("press 1 for cradit card.");
      System.out.println("Press 2 for UPI");
      int choice , amount ;
      System.out.println("Enter your choice : ");
      choice = sc.nextInt();
      System.out.println("Enter amount : ");
      amount = sc.nextInt();
      
      if(choice == 1){
          p = CreditCardPayment();
      }
      else if(choice == 2) {
          p = UPIPayment();
      }
          
  }  
}
