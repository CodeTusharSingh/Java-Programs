public class longestCommonSub {
    // Recursion
    // public int lcs(char[] a, char[] b, int i, int j) {
    // if (i == 0 || j == 0) {
    // return 0;
    // } else if (a[i - 1] == b[j - 1]) {
    // return 1 + lcs(a, b, i - 1, j - 1);
    // } else {
    // return Integer.max(lcs(a, b, i, j - 1), lcs(a, b, i - 1, j));
    // }
    // }
    // Top-Down Approach
    // public int lcs(char[] a, char[] b, int i, int j) {
    // int c[][] = new int[i][j];
    // for (int k = 0; k < i; k++) {
    // for (int l = 0; l < j; l++) {
    // c[k][l] = -1;
    // }
    // }
    // return lcsAUX(a, b, i, j, c);
    // }

    // public int lcsAUX(char[] a, char[] b, int i, int j, int[][] c) {
    // int q = -1;
    // if (i == 0 || j == 0) {
    // return 0;
    // }
    // if (c[i - 1][j - 1] >= 0) {
    // return c[i - 1][j - 1];
    // }
    // if (a[i - 1] == b[j - 1]) {
    // q = 1 + (lcsAUX(a, b, i - 1, j - 1, c));
    // } else {
    // q = Integer.max(lcsAUX(a, b, i, j - 1, c), lcsAUX(a, b, i - 1, j, c));
    // }
    // c[i - 1][j - 1] = q;
    // for (int k = 1; k < i; k++) {
    // for (int l = 1; l < j; l++) {
    // System.out.print(c[k][l] + " ");
    // }
    // System.out.println();
    // }
    // return q;
    // }
    // Bottom-Up Approach
    public int lcs(char[] a, char[] b, int i, int j) {
        int c[][] = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                if (k == 0 || l == 0)
                    c[k][l] = 0;
            }
        }
        for (int k = 1; k < i; k++) {
            for (int l = 1; l < j; l++) {
                if (a[k] == b[l]) {
                    c[k][l] = 1 + c[k - 1][l - 1];
                } else if (c[k - 1][l] >= c[k][l - 1]) {
                    c[k][l] = c[k - 1][l];
                }
            }
        }
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print(c[k][l] + " ");
            }
            System.out.println();
        }
        return c[i - 1][j - 1];
    }

    public static void main(String[] args) {
        longestCommonSub x = new longestCommonSub();
        char[] a = { 'l', 'o', 'n', 'g', 'e', 's', 't' };
        char[] b = { 's', 't', 'o', 'n', 'e' };
        int i = a.length;
        int j = b.length;
        System.out.println(x.lcs(a, b, i, j));
    }
}
