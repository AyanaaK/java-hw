package string.task5;

public class Test10 {
    public static void main(String[] args) {

        String text = "application hello template hello translate";
        String word = "hello";

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            res.append("*");
        }

        int pos = text.indexOf(word);

        while (pos != -1) {
            text = text.substring(0, pos) + res + text.substring(pos + word.length());
            pos = text.indexOf(word, pos + res.length());

        }
        System.out.println(text);


    }
}
