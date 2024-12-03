package com.dmdev.string.lesson1;

//написатть функцию которая принимает 2 параметра: строку и слово - и возрващающую true,
// если строка начинается и заканчивается с этого слова
public class Task2 {

    public static void main(String[] args) {
        String s = "abc ;sdkf;sdk; d";
        System.out.println(startEnds(s, "abc"));
    }

    public static boolean startEnds(String s, String word) {
        return s.startsWith(word) && s.endsWith(word);
    }
}
