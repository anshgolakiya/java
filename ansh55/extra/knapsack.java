import java.util.* ;
public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many items you wants to create : ");
        int items = sc.nextInt() ;
        double weight[] = new double[items];
        double value[] =  new double[items] ;
        double priority[] = new double[items] ;
        for(int i  = 0 ; i < items ; i++) {
            System.out.println("Enter a weight of item " + (i+1) + ": ");
            weight[i] = sc.nextInt() ;
            System.out.println("Enter a value of item " + (i+1) + ": ");
            value[i] = sc.nextInt() ;
            priority[i] = value[i] / weight[i] ;
        }
        for(int i = 0 ; i < items ; i++) {
            System.out.println("weight -> " + weight[i] + " value -> " + value[i] + " V/W -> " + priority[i]);
        }
        System.out.println("Enter maximum weight you are carry : ");
        int W = sc.nextInt() ;
        int weights = 0 ;
        int values = 0 ;
        int a = 0 ;
        // for(int i = 0 ; i < items ; i++)
        // {
            while (weights <= W) {
                double max = priority[0] ;
                for(int j = 0 ; j < items ; j++)
                {
                    if(priority[j] > max)
                    {
                        max = priority[j] ;
                        priority[j] = 0 ;
                        a = j ;
                    }
                    else
                        a = 0 ;
                        priority[0] = 0 ;
                }
                weights += weight[a];
                values += value[a] ;
                for(int i = 0 ; i < items ; i++) {
                     System.out.println("weight -> " + weight[i] + " value -> " + value[i] + " V/W -> " + priority[i]);
                 }
                System.out.println(priority[a]);
                System.out.println("Weight : " + weights);
                System.out.println("value : " + values);
            } 
        //}
    }
}
