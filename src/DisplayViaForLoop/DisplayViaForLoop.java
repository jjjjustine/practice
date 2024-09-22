/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayViaForLoop;

/**
 *
 * @author Jane Justine
 */
public class DisplayViaForLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array of numbers
        int sum = 0; // Initialize sum
        int index = 0; // Index for while loop

        // Use a while loop to calculate the sum
        while (index < numbers.length) {
            sum += numbers[index]; // Add to sum
            index++; // Increment index
        }

        // Display the elements using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Output the sum
        System.out.println("Sum of numbers: " + sum);
    }
}
