public class matrixChainMultiplication {
    // Recursion
    // public int mcm(int n) {
    // if (n == 1) {
    // return 1;
    // } else {
    // int s = 0;
    // for (int i = 1; i < n; i++) {
    // s += mcm(i) * mcm(n - i);
    // }
    // return s;
    // }
    // }

    // Bottom-Up Approach
    public int[][] mcm(int[] dim) {
        int n = dim.length - 1;
        int m[][] = new int[n + 1][n + 1];
        int s[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;
        }
        for (int l = 2; l <= n; l++) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int q = m[i][k] + m[k + 1][j] + dim[i - 1] * dim[k] * dim[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
        for (int i = 1; i < s.length; i++) {
            for (int j = 1; j < s.length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
        printParentheses(s, 1, n);
        System.out.println();
        return m;
    }

    public void printParentheses(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
        } else {
            System.out.print("(");
            printParentheses(s, i, s[i][j]);
            // System.out.println("ONE -> " + i + ", " + j);
            printParentheses(s, s[i][j] + 1, j);
            // System.out.println("TWO -> " + i + ", " + j);
            System.out.print(")");
        }
    }

    public static void main(String[] args) {
        matrixChainMultiplication m = new matrixChainMultiplication();
        char[] matrix = { 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] dim = { 10, 20, 50, 1, 100 };
        System.out.println(m.mcm(dim));
    }
}
