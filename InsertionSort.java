/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @Richard_Agocoy_Julve
 */
public class InsertionSort {
    int[] digits;
    
    public InsertionSort(int[] digits){
        this.digits = digits;
    }
    public void Sort(){
        for (int i = 1; i < digits.length; i++) {
            int key = digits[i];
            System.out.println("Key:" + key );
            int j = i -1;
            System.out.printf("Comparing %d and %d..\n", key, digits[j]);
            while(j >= 0 && digits[j] > key){
                
                digits[j+1]= digits[j];
                digits[j] = key;
                System.out.printf("Moving %d to the left\n", key);
                j--;
                digits[j+1] = key;
            }
            System.out.println(key + " inserted at index: " + (j+1));
            showSubSortedList(i);
        }
        System.out.println("Sorted Num");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }        
    }
    
    public void showSubSortedList(int index){
        System.out.print("Sub-Sorted List: ");
        for (int i = 0; i <= index; i++) {
            System.out.print(digits[i] + " ");
            
        }
        System.out.println();
    }
}
