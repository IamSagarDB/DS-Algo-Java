package Algorithm.Sorting.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {54, 22, 1, 6, 3, 8, 11, 44, 74, 332};
        BubbleSort(array);
        for (int x :array){
            System.out.print(x+" ");
        }

        System.out.println();
    }

    public static void BubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                System.out.println();

            }
        }

    }
}
