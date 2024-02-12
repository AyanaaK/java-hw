package string.task2;

public class Test2 {
    public static void main(String[] args) {

        //Из массива names вывести только те имена которые начинаются на символ `A`
        //Реализация через startsWith

        String names[] = {
                "Alex", "Drake", "Anya", "Leon", "Adam"
        };

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}
