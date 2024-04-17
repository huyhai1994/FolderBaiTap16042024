package queue;

public class Queue {
    public int size;
    public static final int MAX_SIZE = 10;
    public Object[] elements;

    public Queue() {
        this.elements = new Object[MAX_SIZE];
    }

    public void enqueue(Object element) {
        this.elements[size] = element;
        size++;

    }

    public Object dequeue() {
        Object first = this.elements[0];
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return first;
    }

    public void peek() {
        System.out.println(elements[0]);
    }

    public void showList() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println("Customer  " + elements[i]);
        }
    }
}
