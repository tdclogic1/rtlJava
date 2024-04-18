import java.util.Arrays;


public class NumSort_Compare {

    // Array of numbers
    private static int[] numbers = {597, 282, 764, 751, 67, 207, 742, 309, 655, 420, 396, 35, 730, 855, 485, 94, 380, 850, 4, 56, 238, 41, 678, 525, 513, 821, 609, 676, 889, 831, 530, 684, 709, 426, 338, 165, 917, 740, 141, 613, 405, 470, 418, 936, 574, 599, 242, 499, 35, 393, 510, 442, 863, 610, 894, 565, 692, 603, 557, 409, 551, 929, 975, 833, 297, 858, 704, 964, 252, 363, 755, 28, 310, 509, 646, 800, 628, 838, 458, 407, 265, 739, 570, 845, 572, 632, 221, 723, 140, 819, 827, 667, 65, 110, 450, 993, 612, 358, 6, 960};

    public static void main(String[] args) {
        // Copy of the original array for fair comparison
        int[] copyForMergeSort = Arrays.copyOf(numbers, numbers.length);

        // Timing and running recursive insertion sort
        long startTimeInsertion = System.nanoTime();
        recursiveInsertionSort(1);
        long endTimeInsertion = System.nanoTime();
        System.out.println("Sorted by Recursive Insertion Sort: " + Arrays.toString(numbers));
        System.out.println("Insertion Sort Time: " + (endTimeInsertion - startTimeInsertion) + " ms");

        // Timing and running recursive merge sort
        long startTimeMerge = System.nanoTime();
        numbers = recursiveMergeSort(copyForMergeSort);
        long endTimeMerge = System.nanoTime();
        System.out.println("Sorted by Recursive Merge Sort: " + Arrays.toString(numbers));
        System.out.println("Merge Sort Time: " + (endTimeMerge - startTimeMerge) + " ms");
    }

    public static void recursiveInsertionSort(int index) {
        if (index < numbers.length) {
            int key = numbers[index];
            int j = index - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
            recursiveInsertionSort(index + 1);
        }
    }

    public static int[] recursiveMergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Recursively sort both halves
        left = recursiveMergeSort(left);
        right = recursiveMergeSort(right);

        // Merge both sorted halves
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

}
