package string.task3;

public class Test6 {
    public static void main(String[] args) {

        //Вывести первое и последнее слово из строки text
        //Слова в строке text должны быть разделены одним пробелом
        // Реализация через for и charAt

        String text = "application hello transaction template";

        String firstWord = null;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                firstWord = text.substring(0, i);
                break;
            }
        }
        System.out.println(firstWord);

        String lastWord = null;
        for (int i = text.length() - 1; i > 0; i--) {
            if (text.charAt(i) == ' ') {
                lastWord = text.substring(i + 1);
                break;
            }
        }
        System.out.println(lastWord);
    }
}
