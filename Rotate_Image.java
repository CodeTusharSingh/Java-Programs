import java.util.ArrayList;

public class Rotate_Image {
    public void rotate(int[][] matrix) {
        // int temp;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arr.add(matrix[i][j]);
            }
        }
        int min = matrix.length;
        int incr = 0;
        for (int i = 0; i < matrix.length; i++) {
            min = matrix.length;
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = arr.get((arr.size() - min) + incr);
                min += matrix.length;
            }
            incr++;
        }

        // System.out.println();
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

    }

    public static void main(String[] args) {
        Rotate_Image ri = new Rotate_Image();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, {
        // 15,
        // 14, 12, 16 } };
        // int[][] matrix = { { 5, 1, 9, 11, 19 }, { 2, 4, 8, 10, 20 }, { 13, 3, 6,
        // 7,
        // 18 }, { 15, 14, 12, 16, 21 },
        // { 17, 22, 24, 23, 25 } };
        ri.rotate(matrix);
    }
}
// temp = matrix[i][(matrix.length - 1) - j];
// matrix[i][(matrix.length - 1) - j] = matrix[j][i];
// matrix[j][i] = temp;
