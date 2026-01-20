package pr1;

import java.util.* ;
public class Pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount : ");
        int amount = sc.nextInt();
        int note100 = 0 , note50 = 0 , note10 = 0 , note5 = 0 , note1 = 0 ;
        if(amount <= 0)
        {
            System.out.println("invalid amount, Try again !");
        }
        else
        {
            if(amount >= 100){
            note100 = amount/100;
            amount = amount%100;
        }
        if(amount >= 50){
            note50 = amount/50;
            amount = amount%50;
        }
        if(amount >= 10){
            note10 = amount/10;
            amount = amount%10;
        }
        if(amount >= 5){
            note5 = amount/5;
            amount = amount%5;
        }
        if(amount >= 1)
        {
            note1 = amount ;
        }
	Sysyem.out.println("minimum numbe rof notes : ");
        System.out.println("note of 100rs is : " + note100);
        System.out.println("note of 50rs is : " + note50);
        System.out.println("note of 10rs is : " + note10);
        System.out.println("note of 5rs is : " + note5);
        System.out.println("note of 1rs is : " + note1);
        }
    } 
}