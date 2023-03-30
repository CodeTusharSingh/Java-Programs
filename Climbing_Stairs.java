public class Climbing_Stairs {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = c; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Climbing_Stairs cs = new Climbing_Stairs();
        System.out.println(cs.climbStairs(8));
    }
}
