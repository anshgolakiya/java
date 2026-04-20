import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int num = sc.nextInt();
        int[] arr = new int[num] ;
        System.out.println("Enter a elements of array : ");
        // for(int i = 0 ; i < num ; i++){
        //     arr[i] = (int)(Math.random()*100);
        // }
        long T1 = System.nanoTime();
        for (int i = 0; i < num - 1; i++) {
            int min = i;
            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            // for( int k = 0 ; k < num ; k++){
            //     System.out.print(arr[k] + " " );
            // }
            // System.out.println();
        }
        long T2 = System.nanoTime();
        // System.out.println("sorted array using selection sort : ");
        // for(int i  = 0 ; i < num ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println("\nTime taken by selection sort : " + (T2 - T1) + " nanoseconds");
        sc.close();
    }
}