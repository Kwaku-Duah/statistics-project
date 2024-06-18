import java.util.Scanner;
import java.util.InputMismatchException;

public class PeakColumn {

    // method to accept input from user
    public static int[][] matriceInput() {
        Scanner sc = new Scanner(System.in);
        int[][] matrice = null;
        try {
            System.out.println("Enter number of rows");
            int rows = sc.nextInt();

            System.out.println("Enter number of columns");
            int cols = sc.nextInt();

            matrice = new int[rows][cols];

            System.out.println("Enter values for the Matrice separated by spaces e.g, 2 3 4 for first row");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrice[i][j] = sc.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            sc.next(); 

        } catch (NegativeArraySizeException e) {
            System.out.println("Matrix size cannot be negative.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
            sc.close();
        }
        return matrice;
    }

    // Method to check if the element is the maximum in its row
    public static boolean maxInRow(int[][] matrice, int row, int cols) {
        int value = matrice[row][cols];

        for (int j = 0; j < matrice[row].length; j++) {
            if (matrice[row][j] > value) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the element is the minimum in its column
    public static boolean minInColumn(int[][] matrice, int row, int cols) {
        int value = matrice[row][cols];
        for (int i = 0; i < matrice.length; i++) {
            if (matrice[i][cols] < value) {
                return false;
            }
        }
        return true;
    }

    // Method to find peak columns and print with its position
    public static void peakCols(int[][] matrice) {
        if (matrice == null) {
            System.out.println("No valid matrix input provided.");
            return;
        }

        int rows = matrice.length;
        int cols = matrice[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maxInRow(matrice, i, j) && minInColumn(matrice, i, j)) {
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ") = " + matrice[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            int[][] matrice = matriceInput();
            System.out.println("The Peak-Column/s: ");
            peakCols(matrice);
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
    
        }
    }
   
}
