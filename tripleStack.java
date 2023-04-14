public class tripleStack {
    static int size = 10;
    int[] arr = new int[size];
    int top1, top2, top3;

    tripleStack(int top1, int top2, int top3) {
        this.top1 = top1;
        this.top2 = top2;
        this.top3 = top3;
    }

    void push1(int x) {
        if (top1 == size - 2) {
            System.out.println("Stack Overflow.");
            return;
        } else {
            top1 = top1 + 3;
            arr[top1] = x;
        }
    }

    void push2(int x) {
        if (top2 == size - 3) {
            System.out.println("Stack Overflow.");
            return;
        } else {
            top2 = top2 + 3;
            arr[top2] = x;
        }
    }

    void push3(int x) {
        if (top3 == size - 1) {
            System.out.println("Stack Overflow.");
            return;
        } else {
            top3 = top3 + 3;
            arr[top3] = x;
        }
    }

    int pop1() {
        if (top1 < 0) {
            System.out.println("Stack Underflow.");
            return -1;
        } else {
            int p = arr[top1];
            top1 = top1 - 3;
            return p;
        }
    }

    int pop2() {
        if (top2 < 0) {
            System.out.println("Stack Underflow.");
            return -2;
        } else {
            int p = arr[top2];
            top2 = top2 - 3;
            return p;
        }
    }

    int pop3() {
        if (top3 < -0) {
            System.out.println("Stack Underflow.");
            return -3;
        } else {
            int p = arr[top3];
            top3 = top3 - 3;
            return p;
        }
    }

    int peep1() {
        return (top1 < 0 ? -1 : top1);
    }

    int peep2() {
        return (top2 < 0 ? -1 : top2);
    }

    int peep3() {
        return (top3 < 0 ? -1 : top3);
    }

    public static void main(String[] args) {
        tripleStack ts = new tripleStack(-1, -2, -3);
        ts.push1(3);
        ts.push1(5);
        ts.push1(2);
        ts.push2(12);
        ts.push2(82);
        ts.push2(29);
        ts.push3(654);
        ts.push3(729);
        ts.push3(929);
        ts.push3(999);
    }
}
