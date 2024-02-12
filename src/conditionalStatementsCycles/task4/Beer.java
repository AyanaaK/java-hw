package conditionalStatementsCycles.task4;

public class Beer {
    public static void main(String[] args) {
        int numberOfBeer = 99;
        String word = "bottles";

        while (numberOfBeer > 0) {
            System.out.println(numberOfBeer + " " + word + " on the wall");
            System.out.println(numberOfBeer + " " + word + " on the wall");
            System.out.println("Take one down and pass it around");
            numberOfBeer--;
            if (numberOfBeer == 1) {
                word = "bottle";
            }
            if (numberOfBeer > 0) {
                System.out.println(numberOfBeer + " " + word + " on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}

