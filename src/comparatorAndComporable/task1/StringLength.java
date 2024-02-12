package comparatorAndComporable.task1;

public class StringLength implements Comparable<StringLength> {
    private final String value;

    public StringLength(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int compareTo(StringLength stringLength) {
        return (value.length() - stringLength.value.length());
    }

    @Override
    public String toString() {
        return value;
    }
}
