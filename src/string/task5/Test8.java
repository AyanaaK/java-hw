package string.task5;

public class Test8 {
    public static void main(String[] args) {

        //Заменить буквы из переменной word в строке text на звёздочки (*)

        String text = "application hello template hello translate";
        String word = "hello";

        System.out.println(text.replace(word, "*".repeat(word.length())));
    }
}
