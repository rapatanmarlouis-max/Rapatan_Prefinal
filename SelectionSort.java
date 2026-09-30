/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author User
 */
public class SelectionSort {

      int[] numbers;

      public SelectionSort(int[] numbers) {
        this.numbers = numbers;
      }

      public void swapped(int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
      }

      // Print the array
      public void print() {
        for (int number : numbers) {
          System.out.print(number + " ");
        }
      }

      // Selection Sort - Ascending Order
      public void sort() {

        for (int i = 0; i < numbers.length - 1; i++) {
          // Assume the current element is the smallest
          int minIndex = i;
          System.out.printf("Iteration: %d\t", i + 1);
          System.out.printf("Min Index: %d\t", minIndex);
          System.out.println("Min Val:" + numbers[minIndex]);
          // Find the smallest element
          for (int j = i + 1; j < numbers.length; j++) {

            System.out.printf("Index %d: %d => ", j, numbers[j]);
            System.out.printf("Comparing: [%d, %d] =>", numbers[j], numbers[minIndex]);
            if (numbers[j] < numbers[minIndex]) {
              minIndex = j;
              System.out.printf("New Min Index: %d \t New Min Value: %d", minIndex, numbers[minIndex]);
            }

            // print();
            System.out.println();
          }

          // Put the smallest element in the correct position
          if (minIndex != i) {
            swapped(i, minIndex);
          }

          System.out.print("After swap: ");
          print();
          System.out.println();
        }
      }
    }
