package com.dmdev.lesson1;

// написать программу заносящую в массив первых 100 чисел делящихся на 13 и 17 и печатающую их
public class Task2 {

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] divisors = {10, 3, 5, 7};
        array = fillArray(array, divisors);
        Task1.printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i: array) {
            System.out.println(i);
        }
    }

    public static int[] fillArray(int[] array, int[] divisors) {

        int number = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            while (counter != divisors.length) {
                number++;
                for (int divider: divisors) {
                    if (number % divider == 0) {
                        counter++;
                    } else {
                        counter = 0;
                        break;
                    }
                }
            }
            array[i] = number;
        }
        return array;
    }
}
