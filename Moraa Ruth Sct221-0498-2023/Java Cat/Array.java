import java.util.Arrays;
import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[15];
        
        // a) Input 15 numbers from the user and print them
        System.out.println("Enter 15 integers:");
        for (int index = 0; index < 15; index++) {
            numbers[index] = scanner.nextInt();  // Store each entered integer in the array
        }

        System.out.println("Array elements: " + Arrays.toString(numbers));

        // b) Search for a number in the array
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();  // Read the number to search for
        int foundIndex = -1;  // Initialize index to -1 to indicate "not found"
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == searchNumber) {
                foundIndex = index;  // Update foundIndex with the current index
                break;  // Exit the loop once the number is found
            }
        }

        if (foundIndex != -1) {
            System.out.println("Number found at index " + foundIndex);
        } else {
            System.out.println("Number not found in this array");
        }

        // c) Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // d) Create a new array with elements in reverse order
        int[] reversedArray = new int[15];
        for (int index = 0; index < numbers.length; index++) {
            reversedArray[index] = numbers[numbers.length - 1 - index];
        }

        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // e) Get the sum and product of all elements
        int sum = 0;
        long product = 1;
        for (int number : numbers) {
            sum += number;
            product *= number;
        }

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Product of array elements: " + product);
    }
}