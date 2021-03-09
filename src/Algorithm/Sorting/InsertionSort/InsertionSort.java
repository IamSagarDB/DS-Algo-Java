package Algorithm.Sorting.InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8,100,0, 1,0, 10, 2};
        int[] res = InsertionSort(array);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }

    //Algorithm for insertion sort
    public static int[] InsertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > key) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
