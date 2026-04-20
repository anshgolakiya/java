import java.util.* ;
public class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int num = sc.nextInt();
        int[] arr = new int[num] ;
        for(int i = 0 ; i < num ; i++){
            arr[i] = (int)(Math.random()*100) ;
        }
        // System.out.println("Given array:");
        // printArray(arr);
        long T1 = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        long T2 = System.nanoTime();
        // System.out.println("\nSorted array:");
        // printArray(arr);
        System.err.println("\nTime taken by merge sort : " + (T2 -T1) + " nanoseconds");
        sc.close();
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        // printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
