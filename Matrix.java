package g12c.cw4;

import java.util.Arrays;
public class Matrix {

    private static int[][] tempMatrix;
    private static int rows = 0;
    private int[][] Matrix;


    public static void setUpMatrix(int rowCount, int columnCount) {
        if (rowCount > 0 || columnCount > 0) {
            tempMatrix = new int[rowCount][columnCount];
        } else {
            throw new RuntimeException("Rozmiar macierzy jest nieodpowiedni");
        }
    }

    public int[][] getMatrix() {
        return this.Matrix;
    }

    public static void insertRow(int[] row) {
        if (tempMatrix.length > 0) {
            if (row.length >= tempMatrix[0].length) {
                throw new RuntimeException("Macierz ma zbyt dużo wierszy");
            }
            for (int i = 0; i < tempMatrix.length; i++) {
                if (tempMatrix[i][0] == 0) {
                    tempMatrix[i] = row;
                    break;
                }
            }
        }
        throw new RuntimeException("Ilość wierszy nie może wynosić 0");
    }


    public void print() {
        for (int a = 0; a < Matrix.length; a++) {
            System.out.print("| ");
            for (int b = 0; b < Matrix[b].length; b++) {
                System.out.print(Matrix[a][b] + " ");
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public void copy(int[][] tab) {
        Matrix = Arrays.copyOf(tab, tab.length);
    }

    static Matrix create() {
        if (rows == 0) {
            Matrix m = new Matrix();
            m.copy(tempMatrix);
            tempMatrix = null;
            return m;
        } else {
            throw new RuntimeException("Nie podano wszystkich wierszy");
        }
    }

    public Matrix add(Matrix m) {
        for (int i = 0; i < this.Matrix.length; i++) {
            for (int j = 0; j < this.Matrix[i].length; j++)
                this.Matrix[i][j] += m.getMatrix()[i][j];
        }
        return this;
    }

    Matrix add(Matrix m1, Matrix m2) {
        if (m1.Matrix.length != m2.Matrix.length) {
            throw new RuntimeException("Macierze mają inne wymiary");
        }
        Matrix.setUpMatrix(m1.Matrix.length, m1.Matrix[0].length);
        for (int i = 0; i < m1.Matrix.length; i++) {
            int[] row = new int[m1.Matrix[0].length];
            for (int j = 0; j < m1.Matrix[0].length; j++) {
                row[j] = m1.Matrix[i][j] + m2.Matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        return Matrix.create();
    }


    Matrix subtract(Matrix m) {
        for (int i = 0; i < this.Matrix.length; i++) {
            for (int j = 0; j < this.Matrix[i].length; j++)
                this.Matrix[i][j] -= m.getMatrix()[i][j];
        }
        return this;
    }

    Matrix subtract(Matrix m1, Matrix m2) {
        if (m1.Matrix.length != m2.Matrix.length) {
            throw new RuntimeException("Macierze mają inne wymiary");
        }
        Matrix.setUpMatrix(m1.Matrix.length, m1.Matrix[0].length);
        for (int i = 0; i < m1.Matrix.length; i++) {
            int[] row = new int[m1.Matrix[0].length];
            for (int j = 0; j < m1.Matrix[0].length; j++) {
                row[j] = m1.Matrix[i][j] - m2.Matrix[i][j];
            }
            Matrix.insertRow(row);
        }
        return Matrix.create();
    }
}
