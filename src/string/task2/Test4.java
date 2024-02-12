package string.task2;

public class Test4 {
    public static void main(String[] args) {

        //Из массива names вывести только те имена которые начинаются на символ `A`
        //Реализация через charAt

        String names[] = {
                "Alex", "Drake", "Anya", "Leon", "Adam"
        };

        for (String name :
                names) {
            if (name.charAt(0) == 'A') {
                System.out.println(name);
            }
        }
    }
}
