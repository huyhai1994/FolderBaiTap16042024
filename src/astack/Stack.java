package astack;

public class Stack {
    public static final int MAX_SIZE = 10;
    public Object[] elements;
    public int size = 0;

    public Stack() {
        this.elements = new Object[MAX_SIZE];
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(Object object) {
        if (size == MAX_SIZE) {
            System.out.println("Stack is full");
        } else {
            elements[size] = object;
            size++;
        }
    }

    public Object peek() {
        return this.elements[size - 1];
    }

    public void pop() {
        Object[] newData = new Object[size - 1];
        System.arraycopy(elements, 0, newData, 0, size - 1);
        elements = newData;
        size--;
    }
}
