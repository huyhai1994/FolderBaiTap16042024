package aarraylist;

public class ArrayListSelf {
    private Object[] container;
    private int numberOfNodes = 0;
    private static final int CAPACITY_OF_ARRAY_LIST = 10;

    public ArrayListSelf() {
        container = new Object[CAPACITY_OF_ARRAY_LIST];
    }

    public void add(Object object) {
        this.container[numberOfNodes] = object;
        numberOfNodes++;
    }

    public Object get(int index) {

        return this.container[index];
    }

    public void update(int index, Object object) {
    }

    public void insert(int index, Object object) {
    }

    public void readList() {
        for (Object object : container) {
            boolean isObjectNotNull = object != null;
            if (isObjectNotNull)
                System.out.println(object);
        }
    }
}
