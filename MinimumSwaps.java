public class MinimumSwaps {
    public static void main(String[] args) {
        int[] numArr = {4, 3, 1, 2};
        System.out.println(minimumSwaps(numArr));
    }

    static int minimumSwaps(int[] numArr) {
        int swaps = 0;
        int tempNum;
        for (int i = 0; i < numArr.length - 1; i++) {
            tempNum = numArr[numArr[i] - 1];
            while (tempNum != numArr[i]) {
                numArr[numArr[i] - 1] = numArr[i];
                numArr[i] = tempNum;
                swaps++;
            tempNum = numArr[numArr[i] - 1];
            }
        }
        return swaps;
    }
}
