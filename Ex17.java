import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("matrices.txt");
        File outputFile = new File("resultado.txt");

        double[][] matrix1 = readMatrix(inputFile);
        double[][] matrix2 = readMatrix(inputFile);

        double[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        writeMatrix(outputFile, resultMatrix);
    }

    public static double[][] readMatrix(File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            double[][] matrix = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }
            return matrix;
        }
    }

    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
        int aRows = a.length;
        int aCols = a[0].length;
        int bCols = b[0].length;
        double[][] result = new double[aRows][bCols];

        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                for (int k = 0; k < aCols; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void writeMatrix(File file, double[][] matrix) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            writer.println(rows + " " + cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    writer.print(matrix[i][j] + " ");
                }
                writer.println();
            }
        }
    }
}
