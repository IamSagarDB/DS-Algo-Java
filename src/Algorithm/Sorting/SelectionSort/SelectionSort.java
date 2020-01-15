package Algorithm.Sorting.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 7,200, 2, 9, 5, 6,100,0};
        SelectionSort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    // Algorithm for SelectionSort
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
