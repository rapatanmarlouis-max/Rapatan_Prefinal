/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author User
 */
public class QuickSort1 {

    static void displayArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];

        System.out.println("\nPivot: " + pivot);

        int i = left - 1;

        for (int j = left; j < right; j++) {    

            System.out.println("Comparing " + arr[j] + " and " + pivot + "..");

            if (arr[j] < pivot) {

                         
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                System.out.println("Moving " + arr[i] + " to the left");

                System.out.print("Current List: ");
                displayArray(arr);
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        int pivotIndex = i + 1;

        System.out.println(pivot + " inserted at index: " + pivotIndex);

        System.out.print("Sub-Sorted List: ");
        displayArray(arr);

        return pivotIndex;
    }

    static void quickSort(int[] arr, int left, int right) {

        if (left < right) {

            int pivotIndex = partition(arr, left, right);

            quickSort(arr, left, pivotIndex - 1);

            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 50, 20, 60, 15};

        System.out.println("Original List:");
        displayArray(arr);

        System.out.println("\n==============================");
        System.out.println("       QUICK SORT PROCESS");
        System.out.println("==============================");

        // Start Quick Sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Num");
        displayArray(arr);

        System.out.println("\n==============================");
        System.out.println("       SORTING COMPLETE");
        System.out.println("==============================");
    }
}
