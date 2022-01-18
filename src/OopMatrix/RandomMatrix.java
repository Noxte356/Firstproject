package OopMatrix;

public class RandomMatrix {
    int length;
    int width;
    int[][] content;

    RandomMatrix(int length, int width) {
        this.content = new int[length][width];
        this.length = length;
        this.width = width;
        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++) {
                content[i][j] = (int) (Math.random() * 100);
            }

        }
    }

    public void print() {
        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++)
                System.out.print(content[i][j] + " ");
            System.out.println();
        }
    }
}

