package OopMatrix;

public class MatrixCalculator {
    public Matrix sum(RandomMatrix matrix1, RandomMatrix matrix2) {
        int[][] sumContent = new int[matrix1.length][matrix1.width];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.width; j++) {
                sumContent[i][j] = matrix1.content[i][j] + matrix2.content[i][j];
            }
        }
        Matrix sumMatrix = new Matrix(sumContent);
        return sumMatrix;
    }
}
