package string.task4;

public class Test7 {
    public static void main(String[] args) {

        //Определить сколько раз слово из word встречается в text
        //Реализация через цикл for и indexOf со вторым параметром

        String text = "application hello template hello";
        String word = "hello";

        int nums = 0;

        for (int i = text.indexOf(word); i != -1; i = text.indexOf(word, i + word.length())) {
            nums++;
        }
        System.out.println(nums);
    }
}
