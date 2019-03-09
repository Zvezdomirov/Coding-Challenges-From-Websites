package array_of_products;

/*Problem description:
 * Given an array of integers, return a new array such that each element
 * at index i of the new array is the product of all the numbers in the
 * original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5],
 * the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1],
 * the expected output would be [2, 3, 6].*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String result = Arrays.stream(getProductArray(arr))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    private static int[] getProductArray(int[] arr) {
        int[] resultArr = new int[arr.length];
        int currentProduct;
        for (int i = 0; i < arr.length; i++) {
            currentProduct = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    continue;
                }
                currentProduct *= arr[j];
            }
            resultArr[i] = currentProduct;
        }
        return resultArr;
    }
}
