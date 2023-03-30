public class doubleStack {
    static int size = 10;
    int[] arr = new int[size];
    int top1, top2;

    doubleStack(int top1, int top2) {
        this.top1 = top1;
        this.top2 = top2;
    }

    void push1(int x) {
        if (top1 == top2 - 1) {
            System.out.println("Stack Overflow.");
            return;
        } else {
            top1++;
            arr[top1] = x;
        }
    }

    void push2(int x) {
        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow.");
            return;
        } else {
            top2--;
            arr[top2] = x;
        }
    }

    int pop1() {
        if (top1 == -1) {
            System.out.println("Stack Underflow.");
            return -1;
        } else {
            int p = arr[top1];
            top1--;
            return p;
        }
    }

    int pop2() {
        if (top2 == size) {
            System.out.println("Stack Underflow.");
            return -1;
        } else {
            int p = arr[top2];
            top2++;
            return p;
        }
    }

    int peep1() {
        return (top1 == -1 ? -1 : top1);
    }

    int peep2() {
        return (top2 == -1 ? -1 : top2);
    }

    public static void main(String[] args) {
        doubleStack ds = new doubleStack(-1, size);
        ds.push1(1);
        ds.push1(2);
        ds.push1(3);
        ds.push1(4);
        ds.push1(5);
        ds.push2(10);
        ds.push2(9);
        ds.push2(8);
        ds.push2(7);
        ds.push2(6);

    }
}
