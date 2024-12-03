package com.dmdev.lesson1;

// написать программу которая печатает массив сначала в обычном порядке потом в обратном
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = fillArray(array);
        printArray(array);
        printReverseArray(array);
    }


    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + i*2;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printReverseArray(int[] array) {
        for (int i = array.length - 1; i > -1; i--) {
            System.out.println(array[i]);
        }
    }
}
