/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multidimensional;

/**
 *
 * @author Jane Justine
 */
public class Multidimensional {
    public static void main(String[] args) {
        // Create a 2D array
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0; // Initialize sum

        // Calculate the sum of elements using a while loop
        int row = 0;
        while (row < numbers.length) {
            int col = 0;
            while (col < numbers[row].length) {
                sum += numbers[row][col]; // Add to sum
                col++; // Increment column index
            }
            row++; // Increment row index
        }

        // Display the elements using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Output the sum
        System.out.println("Sum of elements: " + sum);
    }
}
