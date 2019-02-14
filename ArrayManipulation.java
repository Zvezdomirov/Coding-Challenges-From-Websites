public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {

        long[] zeroArr = new long[n];

        int lower, upper, sum;
        for (int[] query : queries) {
            lower = query[0];
            upper = query[1];
            sum = query[2];
            zeroArr[lower - 1] += sum;

            if (upper < n) {
                zeroArr[upper] -= sum;
            }
        }
        long temp = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            temp += zeroArr[i];
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
