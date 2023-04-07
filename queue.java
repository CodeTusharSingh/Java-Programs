public class queue {
    static int size = 10;
    int arr[] = new int[size];
    int front, rear;

    queue(int f, int r) {
        front = f;
        rear = r;
    }

    void enqueue(int x) {
        if (rear == (size - 1) && front == 0) {
            System.out.println("Queue Overflow.");
            return;
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = x;
        }
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow.");
            return -1;
        } else {
            int p;
            p = arr[front];
            arr[front] = -1;
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            return p;
        }
    }

    int getfront() {
        return (front < 0 ? -1 : front);
    }

    int getrear() {
        return (rear < 0 ? -1 : rear);
    }

    public static void main(String[] args) {
        queue q = new queue(-1, -1);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        System.out.println(q.getfront());
        System.out.println(q.getrear());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.getfront());
        System.out.println(q.getrear());
    }
}
