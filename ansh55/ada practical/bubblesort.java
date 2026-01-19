import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            // System.out.print("Enetr an element number : ");
            arr[i] = (int) (Math.random() * 100);
            // arr[i] = sc.nextInt();
        }
        long T1 = System.nanoTime();
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        long T2 = System.nanoTime();
        for (int k = 0; k < num; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        System.out.println("Time : " + (T2 - T1));
        sc.close();
    }  
}