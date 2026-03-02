import java.util.*;
public class MCM {
    void print(int s[][] , int i , int j){
        if(i == j){
            System.out.println("A");
        }
        else{
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of matrices: ");
        int n = sc.nextInt();

        int p[] = new int[n + 1];

        System.out.println("Enter dimensions array (size " + (n + 1) + "):");
        for (int i = 0; i <= n; i++) {
            p[i] = sc.nextInt();
        }
        int m[][] = new int[n+1][n+1];
        int s[][] = new int[n+1][n+1] ;

        
        for (int i = 1; i < n; i++)
            m[i][i] = 0;

        
        for (int L = 2; L < n+1; L++) {
            for (int i = 1; i < n - L + 2; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];

                    if (q < m[i][j]){

                        m[i][j] = q;
                        s[i][j] = k ;
                    }
                }
            }
        }
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(i < j )
                    System.out.print(m[i][j] +  " ");
            }
            System.out.println();
        }
        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(i < j )
                    System.out.print(s[i][j] +  " ");
            }
            System.out.println();
        }

        System.out.println("Minimum number of multiplications is: " + m[1][n]);
        sc.close();
    }
}