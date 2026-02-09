
import java.util.Scanner;

public class makingchange {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a number of you wants to use : ");
        int n = sc.nextInt() ;
        int d[] = new int[n+1] ;
        for(int i = 1; i <= n ; i++){
            d[i] = sc.nextInt() ;
        }
        System.out.print("Enetr a amount you wants to makeing change : ");
        int N = sc.nextInt() ;
        int c[][] = new int[n+1][N+1] ;
        for (int i = 1 ; i <= n ; i++)
            c[i][0] = 0 ;
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= N ; j++) {
                if(i == 1 && j <  d[i]){
                    c[i][j] = 99 ;
                }
                else if(i == 1) {
                    c[i][j] = 1+c[1][j-d[1]];
                }
                else if(j < d[i]){
                    c[i][j] = c[i-1][j] ;
                }
                else{
                    c[i][j] = Math.min(c[i-1][j],1+c[i][j-d[i]]) ;
                }
            } 
        }
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= N ; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Minimum coins required : " + c[n][N]);
        sc.close();
   }
}