package Algorithm.Searching.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 3, 10};
        String str = "Sagar Gowda";
        char[] chr = str.toCharArray();

        System.out.println(LinearSearch_Int(8,array));
        System.out.println(LinearSearch_Char('o',chr));


    }

    //Linear Search algorithm for Integer
    public static int LinearSearch_Int(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i+1;
            }
        }
        return -1;
    }

    // Linear Search algorithm gor Characters
    public static int LinearSearch_Char(char num, char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i+1;
            }
        }
        return -1;
    }
}
