package Algorithm.Searching.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] sagar = {2, 6, 4, 13, 66, 9, 3};

        Arrays.sort(sagar);

        for (int x : sagar) {
            System.out.print(x + " ");
        }
        System.out.println();

        int x = BinarySearch(4, sagar);
        System.out.println(x);
    }

    // BinarySearch algorithm
    public static int BinarySearch(int x, int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (x > array[mid]) {
                left = mid + 1;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
