package string.task5;

public class Test9 {
    public static void main(String[] args) {

        String text = "application hello template hello translate";
        String word = "hello";

        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stars.append("*");
        }

        text = text.replace(word, stars.toString());
        System.out.println(text);
    }
}
