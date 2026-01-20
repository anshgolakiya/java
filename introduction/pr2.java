package pr2 ;
import java.util.* ;
class BankAccount {
      String accountId ;
      String accountHolderName ;
      double  Balance ;
      
      void  assignValues(String acid , String acholdername ,double balance) {
          accountId = acid ;
          accountHolderName = acholdername ;
          Balance = balance ;
      }
      void displayValue() {
          System.out.println("Account Id : " + accountId);
          System.out.println("Account holader name  : " + accountHolderName);
          System.out.println("Acccount Balance : " + Balance);
          System.out.println() ;
      }
      void search()
}
public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        BankAccount[] accounts = new BankAccount[5] ;
        for(int i = 0 ; i < 2 ; i++) {
            accounts[i] = new BankAccount() ;
            System.out.println("Enter account Id : ");
            String id = sc.next() ;
            System.out.println("Enter account Holder name  : ");
            String name = sc.next() ;
            System.out.println("Enter account Balance: ");
            Double bal = sc.nextDouble() ;
            accounts[i]. assignValues(id,name,bal) ;
        }
        for(int i = 0 ; i < 2 ; i++) {
            accounts[i].displayValue();
        }
    }
}