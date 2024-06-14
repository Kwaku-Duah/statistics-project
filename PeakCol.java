import java.util.Scanner;

public class PeakCol {

    // Method to accept matrix input from the user
    public static int[][] acceptMatrixInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to check if the element is the maximum in its row
    public static boolean isMaxInRow(int[][] matrix, int row, int col) {
        int value = matrix[row][col];
        for (int j = 0; j < matrix[row].length; j++) {
            if (matrix[row][j] > value) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the element is the minimum in its column
    public static boolean isMinInColumn(int[][] matrix, int row, int col) {
        int value = matrix[row][col];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] < value) {
                return false;
            }
        }
        return true;
    }

    // Method to find and print peak-columns in the matrix
    public static void findPeakColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isMaxInRow(matrix, i, j) && isMinInColumn(matrix, i, j)) {
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ") = " + matrix[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = acceptMatrixInput();
        System.out.println("Peak-columns:");
        findPeakColumns(matrix);
    }
}
