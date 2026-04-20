import java.util.Scanner;
public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        long T1 = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long T2 = System.nanoTime();
        // System.out.println("sorted array using quick sort : "); 
        // for (int i = 0; i < num; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println("\nTime taken by quick sort : " + (T2 - T1) + " nanoseconds");
        sc.close();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
