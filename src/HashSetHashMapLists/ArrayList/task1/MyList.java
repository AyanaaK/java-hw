package HashSetHashMapLists.ArrayList.task1;

public interface MyList {
    void add(Object value);

    void add(String value);

    //метод добавления на опрделенную позицию
    void add(int index, String value);

    //метод для замены по позиции
    void set(int index, String value);

    //метод, чтобы получить значение по позиции
    String get(int index);

    //метод удаления по позиции
    void remove(int index);

    //метод, чтобы проверить наличие
    boolean contains(String value);

    int size();

    void capacity(int requiredCapacity);
}
