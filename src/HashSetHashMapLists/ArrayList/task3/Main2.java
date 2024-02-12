package HashSetHashMapLists.ArrayList.task3;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("a", "b", "c"));
        fill(list1, "z");
        System.out.println(list1);
    }

    private static <T> void fill(List<T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }
}


