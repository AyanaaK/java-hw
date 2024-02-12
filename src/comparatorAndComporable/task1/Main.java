package comparatorAndComporable.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Отсортировать слова из `list` по количеству символов в порядке возрастания.

//        List<StringLength> list = new HashSetHashMapLists.ArrayList<>();
//        list.add(new StringLength("liquid"));
//        list.add(new StringLength("template"));
//        list.add(new StringLength("hi"));
//        list.add(new StringLength("tax"));
//        list.add(new StringLength("transaction"));
//
//
//        Collections.sort(list);
//
//        for (StringLength word : list ){
//            System.out.println(word);
//        }

        List<StringLength> list = new ArrayList<>();
        list.add(new StringLength("liquid"));
        list.add(new StringLength("template"));
        list.add(new StringLength("hi"));
        list.add(new StringLength("tax"));
        list.add(new StringLength("transaction"));


        Collections.sort(list, new StringLengthComparator());

        for (StringLength word : list) {
            System.out.println(word);
        }
    }
}
