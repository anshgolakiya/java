
package pr3;
import java.util.*;
class BankAccount{
    String account_holder_name ;
    double balance ;
    
    static double interest_rate = 5.0 ;
    
    BankAccount(String name , double bal){
        account_holder_name = name ;
        balance = bal ;
    }
           
    void calculate(){
        double interest = (balance*interest_rate) / 100 ;
        balance += interest ;
        System.out.println("Interst added : " + interest);
    }
    void display(){
        System.out.println("Account holder name : " + account_holder_name);
        System.out.println("Accopunt balance : " + balance);
        System.out.println("Intrest rate : " + interest_rate);
        System.out.println("---------------------------");
        
    }
    
    static void updateIntrestrate(double newintrate){
        interest_rate = newintrate ;
        System.out.println("updated interest rate : " + interest_rate);
    }
}
public class pr3 {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("Ansh" ,100000);
    }
}
