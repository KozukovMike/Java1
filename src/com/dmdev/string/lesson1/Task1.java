package com.dmdev.string.lesson1;

// заменить все грустные файлы в строке на веселые :( -> :)
public class Task1 {

    public static void main(String[] args) {
        String test = "dfsd :( :) sdsd :) sdsdfvs :(";
        System.out.println(replacer(test));
    }

    public static String replacer(String s) {
        return s.replace(":(", ":)");
    }
}
