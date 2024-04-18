import java.util.Arrays;

public class RecursiveMergeSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        array = recursiveMergeSort(array);
    }

    private int[] recursiveMergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = recursiveMergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = recursiveMergeSort(Arrays.copyOfRange(array, mid, array.length));
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            result[k++] = left[i] < right[j] ? left[i++] : right[j++];
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
