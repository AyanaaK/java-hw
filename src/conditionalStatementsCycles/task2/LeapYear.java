package conditionalStatementsCycles.task2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //В високосном году 366 дней, year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
        // в обычном 365

        System.out.println("Введите год в формате \"yyyy\"");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("Количество дней 366");
        } else if ((year % 4 == 0) && (year % 100 == 0)
                && (year % 400 == 0)) {
            System.out.println("Количество дней 366");
        } else {
            System.out.println("Количество дней 365");
        }
    }
}
