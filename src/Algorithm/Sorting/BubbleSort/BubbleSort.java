package Algorithm.Sorting.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {54,1000, 22, 1, 6, 3, 8, 900, 11, 44, 74, 332};
        int[] res = BubbleSort(array);
        for (int x : res) {
            System.out.print(x + " ");
        }

    }

    public static int[] BubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
