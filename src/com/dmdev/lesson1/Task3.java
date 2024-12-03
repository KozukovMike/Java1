package com.dmdev.lesson1;


//написать метод equals который определяет равны ли между собой соответсвующие элементы 2 мерных массивов
public class Task3 {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {1, 2},
                {2, 3, 4, 6}
        };
        int[][] array2 = {
                {1, 2, 3},
                {1, 5, 3},
                {2, 3, 4},
                {1}
        };
        System.out.println(compareArrays(array1, array2));
    }

    public static boolean compareArrays(int[][] array1, int[][] array2) {
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            for (int j = 0; j < Math.min(array1[i].length, array2[i].length); j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
