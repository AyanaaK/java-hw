package string.task1;

public class Test {
    public static void main(String[] args) {

        //Проверить, находится ли слово из переменной word в строке из переменной text
        //Реализация через contains

        String text = "application hello template";
        String word = "hello";

        if (text.contains(word)) {
            System.out.printf("Переменная %s находится в строке text \n", word);
        } else {
            System.out.printf("Переменной %s нет в строке \n", word);
        }
    }
}
