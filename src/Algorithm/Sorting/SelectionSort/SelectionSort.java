package Algorithm.Sorting.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 133, 88, 11, 6, 5, 3, 7, 9, 1,0};
        int[] res = SelectionSort(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }

    }

    // Algorithm for SelectionSort
    public static int[] SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        return array;
    }
}
