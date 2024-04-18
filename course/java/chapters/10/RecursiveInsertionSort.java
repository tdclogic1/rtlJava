public class RecursiveInsertionSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        recursiveInsertionSort(array, 1);
    }

    private void recursiveInsertionSort(int[] array, int index) {
        if (index < array.length) {
            int key = array[index];
            int j = index - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            recursiveInsertionSort(array, index + 1);
        }
    }
}
