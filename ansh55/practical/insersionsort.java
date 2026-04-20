import java.util.*;

public class insersionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        // System.out.println("Enter a elements of array : ");
        for (int i = 0; i < num; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        long T1 = System.nanoTime();
        for (int i = 1; i < num; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            // for( int k = 0 ; k < num ; k++){
            //     System.out.print(arr[k] + " " );
            // }
            // System.out.println();
        }
        long T2 = System.nanoTime();
        // System.out.println("sorted array using insertion sort : "); 
        // for (int i = 0; i < num; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println("\nTime taken by insertion sort : " + (T2 - T1) + " nanoseconds");
        sc.close();
    }
}