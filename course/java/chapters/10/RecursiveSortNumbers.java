import java.util.Arrays;

public class RecursiveSortNumbers {

    // Array of numbers
    private static int[] numbers = {34, 7, 23, 32, 55, 12};

    public static void main(String[] args) {

        System.out.println("Number List: " + Arrays.toString(numbers));

        sortNumbers(1); // Start sorting from the second element (index 1)
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
    }

    public static void sortNumbers(int index) {
        if (index < numbers.length) {
            int key = numbers[index];
            int j = index - 1;

            // Find the correct position for the key
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            // Place the key in its correct position
            numbers[j + 1] = key;

            // Recursively sort the remaining part of the array
            sortNumbers(index + 1);
        }
    }
}