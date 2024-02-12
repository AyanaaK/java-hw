package conditionalStatementsCycles.task1;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Это четное число");
        } else {
            System.out.println("Это нечетное число");
        }
    }
}
