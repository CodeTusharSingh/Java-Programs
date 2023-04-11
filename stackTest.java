public class stackTest {
    int size = 10;
    int[] arr = new int[size];
    int top;

    stackTest(int top) {
        this.top = top;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow.");
            return;
        } else {
            top++;
            arr[top] = x;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow.");
            return -1;
        } else {
            int p = arr[top];
            top--;
            return p;
        }
    }

    int peek() {
        return (top == -1 ? -1 : (top));
    }

    public static void main(String[] args) {
        stackTest s1 = new stackTest(-1);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(0);
        s1.push(1);
        s1.push(6);
        s1.push(9);
        s1.push(8);
        s1.push(2);
        s1.push(7);
        System.out.println(s1.peek());
    }
}
