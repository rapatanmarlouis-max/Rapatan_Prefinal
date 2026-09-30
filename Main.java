/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        int[] digits = {30, 42, 8 , 12 , 7 ,5 , 26 , 1 };
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();
        InsertionSort iS = new InsertionSort(digits);
        iS.Sort();
    }
}


