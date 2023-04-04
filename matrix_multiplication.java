import java.text.SimpleDateFormat;
import java.util.Date;

class MultiplicationThreading implements Runnable {
    private int row;
    private int col;
    private int MatrixA[][];
    private int MatrixB[][];
    private int MatrixC[][];

    public MultiplicationThreading(int row, int col, int MatrixA[][], int MatrixB[][], int MatrixC[][]) {
        this.row = row;
        this.col = col;
        this.MatrixA = MatrixA;
        this.MatrixB = MatrixB;
        this.MatrixC = MatrixC;
    }

    public void run() {
        for (int k = 0; k < MatrixB.length; k++) {
            MatrixC[row][col] += MatrixA[row][k] * MatrixB[k][col];
        }
    }
}

public class matrix_multiplication {
    public static final int NUM_OF_THREADS = 9;

    public static void main(String[] args) {
        int row;
        int col;
        int MatrixA[][] = { { 13356, 12546 }, { 12452, 1245 }, { 1256, 4216 } };
        int MatrixB[][] = { { 45452, 42116, 42215 }, { 4513, 4521, 1254 } };
        int MatrixC[][] = new int[3][3];
        int threadcount = 0;
        Thread[] thrd = new Thread[NUM_OF_THREADS];
        try {
            System.out.println(new SimpleDateFormat("yyyy-MM-dd:mm:ss.SS").format(new Date()));
            long start = System.currentTimeMillis();
            for (row = 0; row < 3; row++) {
                for (col = 0; col < 3; col++) {
                    thrd[threadcount] = new Thread(new MultiplicationThreading(row, col, MatrixA, MatrixB, MatrixC));
                    thrd[threadcount].start();
                    threadcount++;
                }
            }

            for (threadcount = 0; threadcount < 9; threadcount++) {
                thrd[threadcount].join();
                threadcount++;
            }
            long end = System.currentTimeMillis();
            System.out.println(new SimpleDateFormat("yyyy-MM-dd:mm:ss.SS").format(new Date()));
            System.out.println("Time elapsed : " + (end - start));
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("Resulting Matrix C: ");
        for (row = 0; row < 3; row++) {
            for (col = 0; col < 3; col++) {
                System.out.print(MatrixC[row][col] + " ");
            }
            System.out.println();
        }
    }
}
