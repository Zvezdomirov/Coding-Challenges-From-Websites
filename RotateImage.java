public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(matrix);
        System.out.println();
        matrix = rotateImage(matrix);
        printMatrix(matrix);
    }

    public static int[][] rotateImage(int[][] imgMatrix) {
        int imgSize = imgMatrix.length;
        int[][] rotatedImage = new int[imgSize][imgSize];
        for (int i = 0; i < imgSize; i++) {
            for (int j = 0; j < imgSize; j++) {
                rotatedImage[j][imgSize - i - 1] = imgMatrix[i][j];
            }
        }
        return rotatedImage;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
