package OopMatrix;

public class Matrix {
    int length;
    int width;
    int[][] content;

    public Matrix(int[][] content) {
        this.content = content;
    }
    public void print() {
        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++)
                System.out.print(content[i][j] + " ");
            System.out.println();
        }
    }
}
