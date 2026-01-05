import java.util.*;
public class metertofoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length in meters :");
        int meters = sc.nextInt();
        double foot = 3.28084 * meters ;
        System.out.println("Length in foot :"+foot);
        sc.close();
    }
}