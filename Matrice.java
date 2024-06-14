import java.util.Scanner;

public class Matrice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number of rows");

        int rows = scan.nextInt();
        System.out.println("Enter number of columns");
        int cols = scan.nextInt();
        int[][] matrixA = new int[rows][cols];
        int minValue = matrixA[0][0];


        System.out.println("Enter values for the Matrix A");
        for (int i=0;i<rows;i++){
            for (int j=0;j <cols;j++){
                System.out.print(matrixA[i][j] + " ");
            }
    }
}
}