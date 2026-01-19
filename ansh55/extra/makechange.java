package extra;
import java.util.Scanner;
public class makechange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of note you want to use : ");
        int num = sc.nextInt();
        int arr[] = new int[num] ;
        int sol[] = new int[num] ;
        for(int i = 0 ; i < num ; i++)
        {
            arr[i] = sc.nextInt() ;
            sol[i] = 0 ;
        }
        System.out.println("Enter a amount you want to change : ");
        int amount = sc.nextInt() ;
        if(amount <= 0)
        {
            System.out.println("please enter valid amount.");
        }
        else
        {
           for(int i = 0 ; amount > 0 ; i++)
           {
                sol[i] = amount / arr[i] ;
                amount = amount % arr[i] ;
           }
        }
        for(int i = 0 ; i < num ; i++)
        {
            System.out.println(sol[i] + " ");
        }
        sc.close();
    }
}