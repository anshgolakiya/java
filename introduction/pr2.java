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
       static void search(BankAccount[] accounts , String accountId) {
           int found = 0 ;
           for(int i = 0 ; i < 2 ; i++){
              if(accounts[i].accountId.equals(accountId)) {
                  accounts[i].displayValue();
                  found = 1 ;
              }
          }
          if(found == 0)
              System.out.println("Account_id does not found.");
      }
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
        System.out.println("Enter an account id you wants found : ");
        String found_id = sc.next() ;
        
        BankAccount.search(accounts, found_id);
    }
}
