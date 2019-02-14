public class ArrayLeftRotation {
    public static void main(String[] args) {

    }

    static int[] rotLeft(int[] numArr, int numOfRotations) {
        int[] rotatedArr = new int[numArr.length];
        for (int i = numOfRotations, j = 0; j < numArr.length; i++, j++) {
            if (i == numArr.length - 1)
            {
                i = -1;
            }
            rotatedArr[i] = numArr[i];
        }
        return rotatedArr;
    }
}
