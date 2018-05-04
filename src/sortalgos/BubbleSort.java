package sortalgos;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Worst Case: O(n²)
 * Average Case: O(n²/2)
 * Best Case O(n)
 */
public class BubbleSort implements Sort {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();

        int[] array = new int[]{2, 32334, 45, 45, 2, 4, 1, 6, 57, 8, 4, 2, 1, 3, 143, 3, 4, 5, 76, 6, 42, 134, 1, 4, 3, 2};

        bs.sort(array);

        System.out.println(Arrays.stream(array).boxed().collect(Collectors.toList()));

    }

    @Override
    public void sort(int[] array) {
        boolean isSorted = false;
        for (int i = 0; i < array.length; i++) {
            boolean switched = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    switched = true;
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
            if(!switched) break;
        }
    }
}
