package Algorithm.Searching.TernarySearch;

import java.util.Arrays;

public class TernarySearch {
    public static void main(String[] args) {

        int[] array = {2, 4, 51, 57, 3, 5, 9, 8};

        Arrays.sort(array);

        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println("");
        int res = ternary_search(0, array.length - 1, array, 57);
        System.out.println(res);
    }

    //Ternary search algorithm
    public static int ternary_search(int left, int right, int[] array, int x) {

        while (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (array[mid1] == x) {
                return mid1;
            }
            if (array[mid2] == x) {
                return mid2;
            }
            if (x < array[mid1]) {
                return ternary_search(left, mid1 - 1, array, x);
            } else if (x > array[mid2]) {
                return ternary_search(mid2 + 1, right, array, x);
            } else {
                return ternary_search(mid1 + 1, mid2 - 1, array, x);
            }
        }
        return -1;
    }
}
