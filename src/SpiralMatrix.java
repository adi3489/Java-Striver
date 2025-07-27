public class SpiralMatrix {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
        int rows = 3, cols = 3;

        int[][] result = fillSpiralMatrix(arr, rows, cols);

        // Print the matrix
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] fillSpiralMatrix(int[] arr, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        int index = 0;

        while (top <= bottom && left <= right && index < arr.length) {
            // left to right
            for (int i = left; i <= right && index < arr.length; i++) {
                matrix[top][i] = arr[index++];
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom && index < arr.length; i++) {
                matrix[i][right] = arr[index++];
            }
            right--;

            // right to left
            for (int i = right; i >= left && index < arr.length; i--) {
                matrix[bottom][i] = arr[index++];
            }
            bottom--;

            // bottom to top
            for (int i = bottom; i >= top && index < arr.length; i--) {
                matrix[i][left] = arr[index++];
            }
            left++;
        }

        return matrix;
    }
}
