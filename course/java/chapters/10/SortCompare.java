import java.util.Arrays;

public class SortCompare {
    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 55, 12};  // Example array
        SortAlgorithm sort1 = new RecursiveInsertionSort();
        SortAlgorithm sort2 = new RecursiveMergeSort();

        // Clone array to ensure both sorts work on the same original data
        int[] copyForSort2 = Arrays.copyOf(numbers, numbers.length);

        // Perform first sort

                // Timing and running recursive insertion sort
                long startTimeInsertion = System.nanoTime();
                sort1.sort(numbers);
                long endTimeInsertion = System.nanoTime();
                System.out.println("Sorted by Recursive Insertion Sort: " + Arrays.toString(numbers));
                System.out.println("Insertion Sort Time: " + (endTimeInsertion - startTimeInsertion) + " ms");
        
        // Perform second sort
        long startTimeMerge = System.nanoTime();
        sort2.sort(copyForSort2);
        long endTimeMerge = System.nanoTime();
        System.out.println("Sorted by Recursive Merge Sort: " + Arrays.toString(copyForSort2));
        System.out.println("Merge Sort Time: " + (endTimeMerge - startTimeMerge) + " ms");
    }
}
