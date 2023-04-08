public class rodCutting {
    // Resurcive Approach
    // public int cutTheRod(int[] p, int n) {
    // int q = -1;
    // if (n == 0) {
    // return 0;
    // }
    // for (int i = 1; i <= n; i++) {
    // q = Integer.max(q, p[i] + cutTheRod(p, n - i));
    // }
    // return q;
    // }

    // Top-Down Approach
    // public int cutTheRod(int[] p, int n) {
    // int[] r = new int[n + 1];
    // for (int i = 0; i <= n; i++) {
    // r[i] = -1;
    // }
    // return cutTheRodAux(p, n, r);
    // }

    // public int cutTheRodAux(int[] p, int n, int[] r) {
    // int q = -1;
    // if (r[n] >= 0) {
    // return r[n];
    // }
    // if (n == 0) {
    // q = 0;
    // } else {
    // q = -1;
    // for (int i = 1; i <= n; i++) {
    // q = Integer.max(q, p[i] + cutTheRodAux(p, n - i, r));
    // }
    // }
    // r[n] = q;
    // return q;
    // }

    // Bottom-Up Approach
    public int cutTheRod(int p[], int n) {
        int[] r = new int[n + 1];
        int[] s = new int[n + 1];
        r[0] = 0;
        int q = -1;
        for (int i = 1; i <= n; i++) {
            q = -1;
            for (int j = 1; j <= i; j++) {
                // q = Integer.max(q, p[j] + r[i - j]);
                if (q < p[j] + r[i - j]) {
                    q = p[j] + r[i - j];
                    s[i] = j;
                }
            }
            r[i] = q;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
        return r[n];
    }

    public static void main(String[] args) {
        rodCutting rc = new rodCutting();
        int[] p = { 0, 1, 5, 8, 10, 13, 17, 18, 22, 25, 30 };
        // int[] p = { 0, 1, 2, 3, 4 };
        int n = 10;
        System.out.println(rc.cutTheRod(p, n));
    }
}
