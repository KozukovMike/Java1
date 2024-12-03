package com.dmdev.lesson1;

//определить сумму элементов находящихся между максимальным и минимальными элементами массива
public class Task4 {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5, 6, 9, 3, 9};
        System.out.println(getSum(array));

    }

    public static int getSum(int[] array) {
        int sum = 0;
        int maxIndex = 0;
        int minIndex = 0;
        int start = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > start) {
                start = array[i];
                maxIndex = i;
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < start) {
                start = array[i];
                minIndex = i;
            }
        }
        for (int i = Math.min(maxIndex, minIndex) + 1; i < Math.max(maxIndex, minIndex); i++) {
            sum += array[i];
        }
        return sum;
    }
}
