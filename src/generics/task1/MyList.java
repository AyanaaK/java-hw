package generics.task1;

import java.util.Comparator;

public interface MyList<T> {
    void add(T value);

    void add(int index, T value);

    void set(int index, T value);

    T get(int index);

    void remove(int index);

    boolean contain(T value);

    int size();

    void capacity(int requiredCapacity);

    void sort(Comparator<? super T> comparator);
}
