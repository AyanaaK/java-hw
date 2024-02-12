package HashSetHashMapLists.ArrayList.task1;

import java.util.Arrays;

public class MyArrayList implements MyList {

    private Object[] items;
    private int size;

    public MyArrayList() {
        items = new Object[10];
        size = 0;
    }

    @Override
    public void add(Object value) {

    }

    @Override
    public void add(String value) {
        capacity(size + 1);
        items[size++] = value;
    }

    @Override
    public void add(int index, String value) {
        capacity(size + 1);

        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }

        items[index] = value;
        size++;
    }

    @Override
    public void set(int index, String value) {
        items[index] = value;
    }

    @Override
    public String get(int index) {
        return (String) items[index];
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }

        items[size - 1] = null;
        size--;
    }

    @Override
    public boolean contains(String value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(items[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void capacity(int requiredCapacity) {
        if (requiredCapacity > items.length) {
            double newCapacity = Math.max((items.length * 1.5) + 1, requiredCapacity);
            items = Arrays.copyOf(items, (int) newCapacity);
        }
    }
}
