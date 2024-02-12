package comparatorAndComporable.task1;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<StringLength> {

    @Override
    public int compare(StringLength stringLength, StringLength t1) {
        return (stringLength.getValue().length() - t1.getValue().length());
    }
}
