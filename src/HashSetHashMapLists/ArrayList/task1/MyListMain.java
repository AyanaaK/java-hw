package HashSetHashMapLists.ArrayList.task1;

public class MyListMain {
    public static void main(String[] args) {

        MyList myList = new MyArrayList();
        myList.add("item #1");
        myList.add("item #2");
        myList.add("item #3");
        myList.add("item #4");
        myList.add("item #5");
        myList.add("item #6");
        myList.add("item #7");
        myList.add("item #8");
        myList.add("item #9");
        myList.add("item #10");
        myList.add(1, "zzz");
        myList.set(2, "item #3");

        myList.remove(1);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        String valueToFind = "zzz";
        boolean containsValue = myList.contains(valueToFind);

        if (containsValue) {
            System.out.println("The list contains: " + valueToFind);
        } else {
            System.out.println("The list does not contain: " + valueToFind);
        }

    }
}
