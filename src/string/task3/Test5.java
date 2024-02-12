package string.task3;

public class Test5 {
    public static void main(String[] args) {

        //Вывести первое и последнее слово из строки text
        //Слова в строке text должны быть разделены одним пробелом
        //Реализация через substring и indexOf

        String text = "application hello transaction template";

        int space1 = text.indexOf(' ');
        String firstWord = text.substring(0, space1);
        System.out.println(firstWord);

        int space2 = text.lastIndexOf(' ');
        String lastWord = text.substring(space2 + 1);
        System.out.println(lastWord);
    }
}
