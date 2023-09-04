package StreamExample01;

import java.util.Arrays;
import java.util.List;

public class AslistAddNumbers {
    public static void main(String[] args) {
        // Create an array of numbers
        Integer[] numbersArray = {5, 10, 15, 20};

        // Convert the array to a list using Arrays.asList
        List<Integer> numbersList = Arrays.asList(numbersArray);

        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the list and calculate the sum
        for (int number : numbersList) {
            sum += number;
        }

        // Print the sum
        System.out.println("The sum of the numbers is: " + sum);
    }
}

