package arrays.task1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] mass = {1, 4, 5, 6, 8, 9};
        int[] mass2 = {2, 3, 7, 10, 11, 12};

        int[] arrays = new int[mass.length + mass2.length];

        //начало первых 2 массивов
        int i = 0;
        int j = 0;

        //начало 3 массива
        int k = 0;

        //Сравните элементы, на которые указывают первые два указателя, и добавьте меньший элемент в новый массив.
        while (i < mass.length && j < mass2.length) {
            if (mass[i] <= mass2[i]) {
                arrays[k++] = mass[i++];
            } else {
                arrays[k++] = mass2[j++];
            }
        }

        while (i < mass.length) {
            arrays[k++] = mass[i++];
        }

        while (j < mass2.length) {
            arrays[k++] = mass2[j++];
        }

        System.out.println(Arrays.toString(arrays));
    }
}
