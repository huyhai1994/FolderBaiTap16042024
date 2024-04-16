package aarraylist;

public class ArrayListSelf {
    private Object[] container;
    private int size = 0;
    private static final int CAPACITY_OF_ARRAY_LIST = 10;

    public ArrayListSelf() {
        container = new Object[CAPACITY_OF_ARRAY_LIST];
    }

    public void add(Object object) {
        boolean isTheListIsFull = (size >= container.length);
        if(isTheListIsFull) {
            Object [] newArrayTwiceOfCurrentArrayCapacity = new Object[container.length * 2];
            System.arraycopy(container, 0,
                    newArrayTwiceOfCurrentArrayCapacity, 0, container.length);
            container = newArrayTwiceOfCurrentArrayCapacity;
        }
        this.container[size] = object;
        size++;
    }

    public Object get(int index) {
        return this.container[index];
    }

    public void update(int index, Object object) {
        this.container[index] = object;
    }

    public void insert(int index, Object object) {
        for (int i = size; i > index; i--) {
            this.container[i] = this.container[i - 1];
        }
        this.container[index] = object;
        size++;
    }
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            this.container[i] = this.container[i + 1];
        }
        this.container[size - 1] = null;
        size--;
    }
    public void removeFirst(){
        this.container[0] = null;
        size--;
    }
    public void removeLast(){
        this.container[size - 1] = null;
        size--;
    }
    public void readList() {
        for (Object object : container) {
            boolean isObjectNotNull = object != null;
            if (isObjectNotNull)
                System.out.println(object);
        }
    }
}
