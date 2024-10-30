package Oct.ex_29102024_duplicates_in_an_array;

import java.util.Arrays;

public class Duplicate_Array_using_sort_method {
    static boolean duplicate_check(int array[]) {
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = {5, 6, 4, 2, 6, 1, 9, 8, 6, 7, 6};
        boolean result = duplicate_check(num);
        System.out.println(Arrays.toString(num));
        if (result) {
            System.out.println("Array is having duplicate value ");
        } else {
            System.out.println("Array is not having duplicate value ");
        }
    }
}
