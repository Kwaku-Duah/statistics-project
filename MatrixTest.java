import java.util.InputMismatchException;
import java.util.Scanner;


public class MatrixTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            // Input for Matrix A
            
            System.out.println("Matrix A");
            System.out.print("Enter number of rows: ");
            int rowA = scan.nextInt();
            System.out.print("Enter number of columns: ");
            int colA = scan.nextInt();
            int[][] matrixA = new int[rowA][colA];
            System.out.println("Enter the values for Matrix A:");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colA; j++) {
                    matrixA[i][j] = scan.nextInt();
                }
            }

            // Display Matrix A
            System.out.println("Displaying Matrix A:");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colA; j++) {
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }

            // Input for Matrix B
            System.out.println("Matrix B");
            System.out.print("Enter number of rows: ");
            int rowB = scan.nextInt();
            System.out.print("Enter number of columns: ");
            int colB = scan.nextInt();
            int[][] matrixB = new int[rowB][colB];
            System.out.println("Enter the values for Matrix B:");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < colB; j++) {
                    matrixB[i][j] = scan.nextInt();
                }
            }

            // Display Matrix B
            System.out.println("Displaying Matrix B:");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < colB; j++) {
                    System.out.print(matrixB[i][j] + " ");
                }
                System.out.println();
            }

            // Check if multiplication is possible
            if (colA != rowB) {
                System.out.println("Matrix Multiplication Failure: columns in Matrix A should be equal to rows in Matrix B");
                return;
            }

            // Perform matrix multiplication
            int[][] result = new int[rowA][colB];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colB; j++) {
                    for (int k = 0; k < colA; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            // Display Resultant Matrix
            System.out.println("Resultant Matrix C:");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < colB; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Non-numeric input detected. Please enter only numeric values.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
