import java.util.Scanner;

public class PascalTriangle {

    // Method to generate Pascal's Triangle
    public int[][] generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];
        
        // Iterate through each row of the triangle
        for (int row = 0; row < numRows; row++) {
            triangle[row] = new int[row + 1]; // Create a new array for the current row
            
            // Populate the row elements
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    triangle[row][col] = 1; // First and last element of each row is 1
                } else {
                    // Calculate other elements using the values from the previous row
                    triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
                }
            }
        }
        
        return triangle;
    }
    

    // Method to print Pascal's Triangle
    public void printPascalsTriangle(int[][] triangle) {
        for (int[] row : triangle) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the Pascal's Triangle generation and printing
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new value ");
        int numRows = scan.nextInt();
        int[][] pascalsTriangle = pt.generatePascalsTriangle(numRows);
        pt.printPascalsTriangle(pascalsTriangle);
    }
}
