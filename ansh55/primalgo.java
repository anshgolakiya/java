import java.util.*;
public class primalgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices : ");
        int num = sc.nextInt();
        int matrix[] [] = new int[num][num];
        int vi[] = new int[num];
        for(int i = 0 ; i < num ; i++)
        {
            for(int j = 0 ; j < num ; j++)
            {
                matrix[i][j]=sc.nextInt();
            }
            vi[i] = 0;
        }
        for(int i = 0 ; i < num ; i++)
        {
            for(int j = 0 ; j < num ; j++)
            {
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }
        int count = 0 ;
        vi[0] = 1 ;
        int U =0 , V =0 ;
        int min =0;
        int total =0 ;
        while(count < num-1)
        {
            min = 99;
            for(int i = 0 ; i < num ; i++)
            {
                if(vi[i] == 1)
                {
                    for(int j = 0 ; j < num ; j++)
                    {
                        //min = matrix[i][j] ;
                        if(matrix[i][j] < min)
                        {
                            min = matrix[i][j];
                            U = i ;
                            V = j ;
                        } 
                    }
                }
            }
            if(vi[U] == 0 && vi[V] == 1 || vi[U] == 1 && vi[V] ==0)
            {
                System.out.println(U + " " + V + " ->" + min);
                count++;
                total += min ;
                vi[U] = vi[V] = 1 ;
            }
            matrix[U][V] = matrix[V][U] = 99 ;
        }
        System.out.println("total = " + total);
        sc.close();
    }
}