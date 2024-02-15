import java.io.*;
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the first matrix (rows cols): ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        double[][] matrix1 = readMatrixFromUser(rows1, cols1, scanner);

        System.out.println("Enter the dimensions of the second matrix (rows cols): ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        double[][] matrix2 = readMatrixFromUser(rows2, cols2, scanner);

        // Write matrices to file
        writeMatricesToFile("matrizes.dat", matrix1, matrix2);

        // Read matrices from file
        double[][] readMatrix1 = readMatrixFromFile("matrizes.dat", 1);
        double[][] readMatrix2 = readMatrixFromFile("matrizes.dat", 2);

        // Multiply matrices
        double[][] resultMatrix = multiplyMatrices(readMatrix1, readMatrix2);

        // Write result matrix to file
        writeMatrixToFile("resultado.dat", resultMatrix);

        System.out.println("The result matrix has been written to 'resultado.dat'");
    }

    public static double[][] readMatrixFromUser(int rows, int cols, Scanner scanner) {
        double[][] matrix = new double[rows][cols];
        System.out.println("Enter the elements of the matrix (one per line): ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    public static void writeMatricesToFile(String filename, double[][] matrix1, double[][] matrix2) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(matrix1);
            oos.writeObject(matrix2);
        }
    }

    public static double[][] readMatrixFromFile(String filename, int matrixNumber) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            double[][] matrix;
            if (matrixNumber == 1) {
                matrix = (double[][]) ois.readObject();
            } else {
                ois.readObject();
                matrix = (double[][]) ois.readObject();
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

    public static void writeMatrixToFile(String filename, double[][] matrix) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(matrix);
        }
    }
}
